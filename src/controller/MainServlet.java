package controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
public class MainServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		//res.setContentType("html/css");
		//PrintWriter out = response.getWriter();
		//out.println("<html>");
		//out.println("<head>");
		//out.println("<title> test d'affichage </title>");
		//out.println("<body>");
		//out.println("<p>HEEEEEEEEEEY </p>");
		//out.println("</body>");
	//	out.println("<html>");
			
		
			String paraNom = request.getParameter("nom");
			String message = "Transmission de variables : OK !" + paraNom;	
			request.setAttribute( "message", message );
			this.getServletContext().getRequestDispatcher( "/WEB-INF/index.jsp" ).forward( request, response );
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
