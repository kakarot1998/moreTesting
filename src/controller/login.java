package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String nom = request.getParameter("nom");
		String msg = "";
		if (nom!= "" && nom!=null ) {
			
			msg = "weclome " + nom;
			request.setAttribute("message", msg);
			this.getServletContext().getRequestDispatcher("/WEB-INF/result.jsp").forward(request,response);
			
		}else {
			msg="ta ktb shi l3ba hhhhhhhhhhhhhhhhh";
			request.setAttribute("message", msg);
			this.getServletContext().getRequestDispatcher("/login.jsp").forward(request,response);


			
			
		}
		
		
		
		
		
		
		
	}

}
