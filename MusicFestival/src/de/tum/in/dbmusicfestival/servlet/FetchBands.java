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

import de.tum.in.dbmusicfestival.bean.Band;
import de.tum.in.dbmusicfestival.exception.MusicFestivalException;
import de.tum.in.dbmusicfestival.model.BandDAO;

/**
 * Servlet implementation class FetchBands
 */
@WebServlet("/fetchBands")
public class FetchBands extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchBands() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*HttpSession session = request.getSession();
		String email=(String) session.getAttribute("email");
		if(email==null){
			
		}*/
		BandDAO bandDAO = new BandDAO();
		try {
			List<Band> bandsPlaying = bandDAO.fetchBandsPlaying();
			request.setAttribute("bandsplaying", bandsPlaying);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/displayBands.jsp");
    		dispatcher.forward(request, response);	
		} catch (ClassNotFoundException|SQLException|MusicFestivalException e) {
			request.setAttribute("error", e.toString() + e.getMessage());
			e.printStackTrace();
		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
