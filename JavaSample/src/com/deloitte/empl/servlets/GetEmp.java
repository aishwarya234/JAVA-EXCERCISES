package com.deloitte.empl.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;
import java.util.List;
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;


@WebServlet(urlPatterns={"/GetEmp"},initParams={@WebInitParam(name="mobile",value="12345"),@WebInitParam(name="car",value="4")})
public class GetEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public GetEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		ServletContext ctx = getServletContext();
		out.println("City = "+ctx.getInitParameter("city")+"<br>"); 
		out.println("Status = "+ctx.getInitParameter("lap")+"<br>"); 
		
		
		ServletConfig config = getServletConfig();
		out.println("mobile = "+config.getInitParameter("mobile")+"<br>"); 
		out.println("car = "+config.getInitParameter("car")+"<br>"); 
		
		
		EmpDao dao = new EmpDaoImpl();
		List<Emp> emplist = dao.getEmpls();
		out.println("<table border=2>");
		out.println("<tr><th>EMPNO<TH>EMPNAME<TH>JOB<th>mgr<th>hiredate<th>sal<th>comm<th>deptno</tr>");
		for(Emp e : emplist){
			out.println("<tr>");
			out.println("<td>"+e.getEmpno()+"</td>");
			out.println("<td>"+e.getEname()+"</td>");
			out.println("<td>"+e.getJob()+"</td>");
			out.println("<td>"+e.getMgr()+"</td>");
			out.println("<td>"+e.getHiredate()+"</td>");
			out.println("<td>"+e.getSal()+"</td>");
			out.println("<td>"+e.getComm()+"</td>");
			out.println("<td>"+e.getDeptno()+"</td>");
			
			
			
			
		
			
			out.println("</tr>");
		}
		out.println("</table>");
	}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	}

}
