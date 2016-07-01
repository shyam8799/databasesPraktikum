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

	public boolean addNewEmployee(Employee employee) throws ClassNotFoundException, SQLException, MusicFestivalException{
		
		String query = "INSERT INTO employee VALUES(?, ?, ?, ?, ?, ?);";
		
		Class.forName("org.postgresql.Driver");
		Connection con = DBConfiguration.createConnection();
		con.setAutoCommit(false);
		
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, employee.geteId());
		pstmt.setInt(2, employee.getrId());
		pstmt.setInt(3, employee.getoId());
		pstmt.setString(4, employee.getFirstName());
		pstmt.setString(5, employee.getLastName());
		pstmt.setString(6, employee.getIBAN());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
		
		return true;
	}
	
	public boolean removeEmployee(Employee employee) throws ClassNotFoundException, SQLException, MusicFestivalException{
		
		String query = "DELETE FROM employee WHERE eid = ?";
		
		Class.forName("org.postgresql.Driver");
		Connection con = DBConfiguration.createConnection();
		con.setAutoCommit(false);
		
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, employee.geteId());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
		
		return true;
		
	}
	
}
