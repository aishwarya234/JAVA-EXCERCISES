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
 * Servlet implementation class Validate
 */
@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		//HttpSession session1=request.getSession();
		HttpSession session=request.getSession();
		String user=request.getParameter("user");
		String password=request.getParameter("password");
		RequestDispatcher rd;
		if(user.equals("")||password.equals("")){
			out.println("<font color=red >password/user field cannot be empty</font>");
			rd=request.getRequestDispatcher("Form.html");
			//rd.include(request, response); 
		}
		
		else{
		if(user.equals("admin")&&password.equals("admin")){
		
		
			session.setAttribute("status", "allowed");
			rd=request.getRequestDispatcher("Admin");
		}
		else if(user.equals("admin")&&!password.equals("admin")){
			session.setAttribute("status", "allowed");
			out.println("<font color=red>User name is admin but the password doesn't match</font>");
			rd=request.getRequestDispatcher("Form.html");
			//rd.include(request, response);
		}
		else{
			
			session.setAttribute("status", "allowed");
			rd=request.getRequestDispatcher("User");
			
		}	}
		
		//rd.forward(request, response);
		rd.include(request,response);
		//out.println("Success");}
		//out.println("<a href=Form.html  >click to go back</a> ");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}

