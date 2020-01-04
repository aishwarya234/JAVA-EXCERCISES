package com.deloitte.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.dept.beans.Dept;
import com.deloitte.dept.dao.DeptDao;
import com.deloitte.dept.dao.impl.DeptDaoImpl;
import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

/**
 * Servlet implementation class GetInfo
 */
@WebServlet("/GetInfo")
public class GetInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		
		//Displaying the Emp table
		EmpDao dao = new EmpDaoImpl();
		List<Emp> emplist = dao.getEmpls();
		out.println("<h3<CENTER>Employee Table</center></h3><br>");
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
		
		//displaying the dept table
		
		DeptDao dao1 = new DeptDaoImpl();
		List<Dept> deptlist = dao1.getEmpls();
		out.println("<h3<CENTER>Department Table</center></h3><br>");
		out.println("<table border=2>");
		out.println("<tr><th>DEPTNO<TH>DNAME<TH>LOC</tr>");
		for(Dept d : deptlist){
			out.println("<tr>");
			out.println("<td>"+d.getDeptno()+"</td>");
			out.println("<td>"+d.getDname()+"</td>");
			out.println("<td>"+d.getLoc()+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
