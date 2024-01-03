package com.servlet.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Validate
 */
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Validate() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String username=request.getParameter( "uname")	;
	String password=request.getParameter( "psw")	;

	if(username.equals("manoj")&&password.equals("1234"))
	{
		HttpSession session=request.getSession();
		session.setAttribute("username", username);
		response.sendRedirect("Welcome");
		
		
	}else
	{
		response.getWriter().println("invalid credentials");
	}
		
		
		
		
		
		
		
		
		
	}}
		
		
		
		
		//response.setContentType("type/html");
//PrintWriter out=response.getWriter();
//String name=request.getParameter("uname");
//String password=request.getParameter("psw");
//
////RequestDispatcher rd=null;
////if(password.equals("1234"))
////{
////	
////}
//	Cookie ck=new Cookie("Username",name);
//	ck.setMaxAge(100);
//	response.addCookie(ck);
//	
//
//	response.sendRedirect("Welcome");
//
////else
////
////{
////	
////out.print("inavlid password");
////rd=request.getRequestDispatcher("LogIn.html");
////rd.forward(request, response);
////}
//	
	
//	}

//}
