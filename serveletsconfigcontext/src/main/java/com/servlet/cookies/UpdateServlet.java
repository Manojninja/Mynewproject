package com.servlet.cookies;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.*;
import jakarta.servlet.RequestDispatcher;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=null;
		String firstname = request.getParameter("firstname");
	    String lastname = request.getParameter("lastname");
	    String email = request.getParameter("email");
	    String password = request.getParameter("password");
	    String address = request.getParameter("address");
	    Registerquery query=new Registerquery();
	    
		
		int count;
		try {
			count = query.update(firstname, lastname, email, password, address);
		
	    if(count>0)
	    {
	    	rd=request.getRequestDispatcher("View.jsp");
	    	rd.forward(request, response);
	    	//response.sendRedirect("view.jsp");
	    }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
	}

}
