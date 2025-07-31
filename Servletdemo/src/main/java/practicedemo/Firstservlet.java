package practicedemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Firstservlet
 */
@WebServlet("/Firstservlet")
public class Firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");//MIME TYPE
		
		PrintWriter outobj=response.getWriter();//Character Stream
		outobj.println("Hello Servlet!");
		outobj.println("<font color=red><h1>Hello Servlet!");//Servlet+HTML 
		outobj.println("<h1 style=color:yellow>Servlet With Inline css</h1>");//CSS=>Cascading Style Sheet

	}
	//doPost will work only with html files!
	

}
