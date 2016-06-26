package de.tum.in.dbpra;

import java.io.IOException;
import java.util.Stack;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.tum.in.dbpra.model.bean.OrderBean;
import de.tum.in.dbpra.model.dao.OrdersDAO;

/**
 * Servlet implementation class OrdersServlet
 */
@WebServlet("/orders")
public class OrdersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrdersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
        	OrdersDAO dao = new OrdersDAO();
        	
        	Stack<OrderBean> orders = new Stack<OrderBean>();
        	
        	dao.getOrders(orders, "no");
        	
        	OrderBean[] ordersArray = new OrderBean[ orders.size() ];
        	
        	for(int i = 0 ; i < ordersArray.length; i++){
        		ordersArray[i] = orders.pop();
        	}
        	
        	request.setAttribute("ordersNo", ordersArray);
        	
        	orders = new Stack<OrderBean>();
        	
        	dao.getOrders(orders, "ok");
        	
        	ordersArray = new OrderBean[ orders.size() ];
        	
        	for(int i = 0 ; i < ordersArray.length; i++){
        		ordersArray[i] = orders.pop();
        	}
        	
        	request.setAttribute("ordersOk", ordersArray);
    	} catch (Throwable e) {
    		e.printStackTrace();
    		request.setAttribute("error", e.toString() + e.getMessage());
    	}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/exercise72.jsp");
		dispatcher.forward(request, response);
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
        	
    	} catch (Throwable e) {
    		e.printStackTrace();
    		request.setAttribute("error", e.toString() + e.getMessage());
    	}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/CustomerView.jsp");
		dispatcher.forward(request, response);
		
	}

}