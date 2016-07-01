package de.tum.in.dbmusicfestival.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.tum.in.dbmusicfestival.bean.Note;
import de.tum.in.dbmusicfestival.exception.MusicFestivalException;

public class NoteDAO {

	public boolean addNote(Note note) throws ClassNotFoundException, SQLException, MusicFestivalException{
		
		String query = "INSERT INTO note VALUES(?, ?, ?, ?)";
		
		Class.forName("org.postgresql.Driver");
		Connection con = DBConfiguration.createConnection();
		con.setAutoCommit(false);
		
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, note.getNoId());
		pstmt.setInt(2, note.getrId());
		pstmt.setString(3, note.getText());
		pstmt.setTimestamp(4, note.getTimestamp());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
		
		return true;
		
	}
	
}
