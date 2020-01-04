package javasample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletForRequest
 */
@WebServlet("/ServletForRequest")
public class ServletForRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletForRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String name1=request.getParameter("empname");
		String mail=request.getParameter("mail");
		String doj=request.getParameter("doj");
		String job=request.getParameter("D1");
		int salary=Integer.parseInt(request.getParameter("salary"));
		
		//int sal1=Integer.parseInt(request.getParameter("sal"));
		out.println("Empname="+name1+"<br>");
		out.println("Mail ID="+mail+"<br>");
		out.println("Date Of Joining"+doj+"<br>");
		out.println("job="+job+"<br>");
		out.println("salary="+salary+"<br>");
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
