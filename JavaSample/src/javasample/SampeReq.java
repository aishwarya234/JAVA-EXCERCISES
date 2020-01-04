package javasample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampeReq
 */
@WebServlet("/SampeReq")
public class SampeReq extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		/response.getWriter().append("Served at: ").append(request.getContextPath());
	PrintWriter out=response.getWriter();
	String name1=request.getParameter("empname");
	int sal1=Integer.parseInt(request.getParameter("sal"));
	out.println("Empname="+name1+"<br>");
	out.println("salary is"+sal1+"<br>");
	String [] skills=request.getParameterValues("skills");
	for(String s:skills)
		out.println(s+" ");
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//@Override
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
*/
}
