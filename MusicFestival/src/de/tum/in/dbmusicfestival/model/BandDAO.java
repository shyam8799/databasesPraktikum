package de.tum.in.dbmusicfestival.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.tum.in.dbmusicfestival.bean.Band;
import de.tum.in.dbmusicfestival.exception.MusicFestivalException;

public class BandDAO {

	public List<Band> fetchBandsPlaying() throws ClassNotFoundException, SQLException, MusicFestivalException {
		Class.forName("org.postgresql.Driver");
		Connection conn=DBConfiguration.createConnection();
		Statement fetchBands=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet bandsPlaying=fetchBands.executeQuery("select * from band where accepted='t'");
		if(!bandsPlaying.next()){
			throw new MusicFestivalException("No Bands Found!!");
		}
		List<Band> bands= new ArrayList<Band>();
		bandsPlaying.beforeFirst();
		while(bandsPlaying.next()){
			Band band=new Band();
			band.setbId(bandsPlaying.getInt("bid"));
			band.setName(bandsPlaying.getString("name"));
			band.setManager(bandsPlaying.getString("manager"));
			band.setTimeSlotStart(bandsPlaying.getTimestamp("timeslotstart"));
			band.setTimeSlotEnd(bandsPlaying.getTimestamp("timeslotend"));
			band.setPressInfo(bandsPlaying.getString("pressinfo"));
			bands.add(band);
		}
		conn.close();
		return bands;
	}
}
