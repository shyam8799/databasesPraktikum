package de.tum.in.dbmusicfestival.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.tum.in.dbmusicfestival.bean.Employee;
import de.tum.in.dbmusicfestival.exception.MusicFestivalException;

public class EmployeeDAO {

	public boolean addNewEmployee(int eid, int rid, int oid, String firstname, String lastname, String iban) throws ClassNotFoundException, SQLException, MusicFestivalException{
		
		String query = "INSERT INTO employee VALUES(?, ?, ?, ?, ?, ?);";
		
		Class.forName("org.postgresql.Driver");
		Connection con = DBConfiguration.createConnection();
		con.setAutoCommit(false);
		
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, eid);
		pstmt.setInt(2, rid);
		pstmt.setInt(3, oid);
		pstmt.setString(4, firstname);
		pstmt.setString(5, lastname);
		pstmt.setString(6, iban);
		
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
		
		return true;
	}
	
}
