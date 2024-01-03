package com.servlet.cookies;

import java.io.*;
import jakarta.servlet.http.HttpSession;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Welcome() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		HttpSession session = request.getSession(false);
		if(session!=null && session.getAttribute("username")!=null)
		{
			String username=(String)session.getAttribute("username");
			
			response.getWriter().println("welcome:"+username)	;
			
			//response.getWriter().println("<form action=\"./Logout\" >"+"<button type='submit'>Logout</button> </form>");
			response.sendRedirect("Logout.html");
			
		}else
		{
			response.sendRedirect("Login.html");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}}
//		RequestDispatcher rd=null;
//
//	response.setContentType("text/html");
//	PrintWriter out=response.getWriter();
//	Cookie[] cks=request.getCookies();
//	out.print("Welcome"+" "+cks[0].getValue());
//	out.print("do u want to logout");
//	try {
//		Thread.sleep(100);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	rd=request.getRequestDispatcher("Logout.html");
//	rd.forward(request, response);	}
//
//}
