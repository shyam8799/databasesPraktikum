package de.tum.in.dbmusicfestival.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfiguration {

	public static final String HOST = "localhost";
	public static final String PORT = "5432";
	public static final String DB = "musicfestival";
	public static final String USER = "postgres";
	public static final String PASS = "lotusnair";
	
	public static Connection createConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:postgresql://"+HOST+":"+PORT+"/"+DB,USER,PASS);
	}
}
