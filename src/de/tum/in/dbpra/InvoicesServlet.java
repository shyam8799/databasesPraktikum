package de.tum.in.dbpra;

import java.io.IOException;
import java.util.Stack;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.tum.in.dbpra.model.bean.CustomerBean;
import de.tum.in.dbpra.model.bean.OrderBean;
import de.tum.in.dbpra.model.dao.CustomerDAO;
import de.tum.in.dbpra.model.dao.OrdersDAO;

/**
 * Servlet implementation class OrdersServlet
 */
@WebServlet( name="InvoicesServlet", displayName="Invoices Servlet", urlPatterns = {"/invoices/*"})
public class InvoicesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvoicesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			OrdersDAO dao = new OrdersDAO();

			String order = request.getPathInfo().replace("/", "");
			int orderid = Integer.parseInt(order);
									
        	CustomerBean customer = new CustomerBean();
        	customer = dao.getUserByOrder(orderid);
        	
        	Stack <String[]>  allData = new Stack<>();
        	
        	allData = dao.getAllOrderData(orderid);
        	
        	int size = allData.size();
        	String[][] allDataArray = new String[size][8];
        	double total = 0;
        	
        	for(int i = 0 ; i < size; i++){
        		allDataArray[i] = allData.pop();
        		total += Double.parseDouble(allDataArray[i][1]); 
        	}
        	 	
        	request.setAttribute("allData", allDataArray);
        	request.setAttribute("customer", customer);
        	request.setAttribute("orderid", order);
        	request.setAttribute("total", total);

						
    	} catch (Throwable e) {
    		e.printStackTrace();
    		request.setAttribute("error", e.toString() + e.getMessage());
    	}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/exercise74.jsp");
		dispatcher.forward(request, response);
	}
	


}