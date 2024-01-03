package serveletsconfigcontext;

import java.io.*;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Serveletcontext")
public class Serveletcontext extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Serveletcontext() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		ServletContext sct=getServletContext();
		String x=sct.getInitParameter("Email");
		out.print("website:"+x);
//		String drivername=config.getInitParameter("drivers");
//		out.print("driver name :"+drivername);
		
	}
}
