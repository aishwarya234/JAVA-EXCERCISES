package javasample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class User
 */
@WebServlet("/User")
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter out=response.getWriter();
		RequestDispatcher rd;
		PrintWriter out=response.getWriter();
		HttpSession session1=request.getSession();
		 String a=(String)session1.getAttribute("status1");
		 if(a.equals("alloweduser")){
		out.println("Welcome  :"+request.getParameter("user")+"<br>");
		out.println("<a href=Form.html  >click to go back</a> ");}
		 
		 else{
			 out.println("Authorisation failed");
			 rd=request.getRequestDispatcher("Form.html");
			 rd.include(request, response);
		 }
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
