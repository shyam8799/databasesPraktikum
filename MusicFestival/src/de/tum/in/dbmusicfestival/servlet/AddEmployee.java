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

import de.tum.in.dbmusicfestival.exception.MusicFestivalException;
import de.tum.in.dbmusicfestival.model.EmployeeDAO;

@webServlet("/addEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public AddEmployee(){
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		
		try{
			
			employeeDAO.addNewEmployee(eid, rid, oid, firstname, lastname, iban);
			
		}
		catch(ClassNotFoundException|SQLException|MusicFestivalException e){
			
			request.setAttribute("error", e.toString() + e.getMessage());
			e.printStackTrace();
		}
	}
	
	
}
