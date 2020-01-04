package com.deloitte.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.dept.dao.DeptDao;
import com.deloitte.dept.dao.impl.DeptDaoImpl;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

/**
 * Servlet implementation class DeleteEmp
 */
@WebServlet("/DeleteEmp")
public class DeleteEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmp() {
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
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		int empno=Integer.parseInt(request.getParameter("empno"));
		EmpDao dao=new EmpDaoImpl();
		int rows=dao.deleteEmp(empno);
		if(rows>0)
			out.println("<b>Deleted Record from Employee Table</b><br><br><br><br>");
		else
			out.println("<b>Couldn't delete from Employee table</b><br><br><br><br>");
		
		int deptno=Integer.parseInt(request.getParameter("deptno"));
		DeptDao dao1=new DeptDaoImpl();
		int rowsdept=dao1.deleteEmpFromDept(deptno);
		if(rowsdept>0)
		out.println("<b>Deleted Record from Department table</b><br.");
		else
			out.println("<b>Couldn't delete record from Department table</b><br>");
		
		
		
	}

}
