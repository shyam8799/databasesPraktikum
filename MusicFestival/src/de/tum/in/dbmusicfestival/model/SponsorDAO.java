package de.tum.in.dbmusicfestival.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.tum.in.dbmusicfestival.bean.Sponsor;
import de.tum.in.dbmusicfestival.exception.MusicFestivalException;

public class SponsorDAO {

	public List<Sponsor> fetchSponsorsAvailable() throws ClassNotFoundException, SQLException, MusicFestivalException {
		Class.forName("org.postgresql.Driver");
		Connection conn=DBConfiguration.createConnection();
		Statement fetchSponsors=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet sponsorsPresent=fetchSponsors.executeQuery("select * from sponsor where accepted='TRUE'");
		if(!sponsorsPresent.next()){
			throw new MusicFestivalException("No Sponsors Found!!");
		}
		List<Sponsor> sponsors= new ArrayList<Sponsor>();
		sponsorsPresent.beforeFirst();
		while(sponsorsPresent.next()){
			Sponsor sponsor=new Sponsor();
			sponsor.setSpId(sponsorsPresent.getInt("spid"));
			sponsor.setName(sponsorsPresent.getString("name"));
			sponsor.setAddress(sponsorsPresent.getString("address"));
			sponsor.setPhone(sponsorsPresent.getString("phone"));
			sponsor.setEmail(sponsorsPresent.getString("email"));
			sponsors.add(sponsor);
		}
		conn.close();
		return sponsors;
	}
}
