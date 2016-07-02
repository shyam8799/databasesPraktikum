package de.tum.in.dbmusicfestival.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.tum.in.dbmusicfestival.bean.Song;
import de.tum.in.dbmusicfestival.exception.MusicFestivalException;

public class SongDAO {

	public List<Song> fetchSongsList() throws ClassNotFoundException, SQLException, MusicFestivalException {
		Class.forName("org.postgresql.Driver");
		Connection conn=DBConfiguration.createConnection();
		Statement fetchSongs=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet songsPlaying=fetchSongs.executeQuery("SELECT * FROM song");
		if(!songsPlaying.next()){
			throw new MusicFestivalException("No Bands Found!!");
		}
		List<Song> songs= new ArrayList<Song>();
		songsPlaying.beforeFirst();
		while(songsPlaying.next()){
			Song song=new Song();
			song.setSoId(songsPlaying.getInt("soid"));
			song.setSongName(songsPlaying.getString("songname"));
			song.setDuration(songsPlaying.getDouble("duration"));
			songs.add(song);
		}
		conn.close();
		return songs;
	}
}
