package com.serve_demo;
import java.text.SimpleDateFormat; 
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
public class Myfirrst extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    public Myfirrst() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init()throws ServletException
    {
    	System.out.println("init");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String name=request.getParameter("firstname");
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		out.print("<html><body>");
//		out.print("<h1>firstname :"+name);
//		String lname=request.getParameter("lastname");
//		response.setContentType("text/html");
//		PrintWriter out1=response.getWriter();
//		out1.print("<html><body>");
//		out1.print("<h1>lastname :"+lname);
//		String email=request.getParameter("email");
//		response.setContentType("text/html");
//		PrintWriter out2=response.getWriter();
//		out2.print("<html><body>");
//		out2.print("<h1>email :"+email);
//		String password=request.getParameter("password");
//		response.setContentType("text/html");
//		PrintWriter out6=response.getWriter();
//		out6.print("<html><body>");
//		out6.print("<h1>firstname :"+password);
//		String address=request.getParameter("address");
//		response.setContentType("text/html");
//		PrintWriter out4=response.getWriter();
//		out4.print("<html><body>");
//		out4.print("<h1>adress :"+address);
//		Registrationdbconnect r= new Registrationdbconnect();
//		
//				try {
//					r.insert(name, lname, email, password,  address);
//				} catch (ClassNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			
//		
//		
//	}
//	
//	public void destroy()
//	{
//		System.out.println("destroyed");
//	}
		
		String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        
        
        Registration_details registration = new Registration_details ();
        Registrationdbconnect rd =new Registrationdbconnect(); 
         registration.setFirstname(firstname);
         registration.setLastname(lastname);
         registration.setEmail(email);
         registration.setPassword(password);
         registration.setAddress(address);
    try {
    	Registrationdbconnect.register(registration);
    }
    catch(Exception e)
    {
        
    }
    {
    response.sendRedirect("registration.html");
    }

		
		
	}

	}


