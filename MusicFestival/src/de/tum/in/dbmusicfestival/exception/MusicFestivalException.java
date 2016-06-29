package de.tum.in.dbmusicfestival.exception;

public class MusicFestivalException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MusicFestivalException(String message){
		super(message);
	}
	
	public String getMessage(){
		return super.getMessage();
	}

}
