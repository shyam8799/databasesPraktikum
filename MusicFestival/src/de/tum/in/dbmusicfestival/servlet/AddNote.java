package de.tum.in.dbmusicfestival.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import de.tum.in.dbmusicfestival.model.NoteDAO;
import de.tum.in.dbmusicfestival.exception.MusicFestivalException;

@WebServlet("/addNote")
public class AddNote {
	private static final long serialVersionUID = 1L;
	
	public AddNote(){
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		NoteDAO noteDAO = new NoteDAO();
		
		try{
			
			noteDAO.addNote();
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("");
    		dispatcher.forward(request, response);
			
		}
		catch(ClassNotFoundException|SQLException|MusicFestivalException e){
			
			request.setAttribute("error", e.toString() + e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
	
}
