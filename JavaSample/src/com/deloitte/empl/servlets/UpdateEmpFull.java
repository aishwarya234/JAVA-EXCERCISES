package com.deloitte.empl.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

/**
 * Servlet implementation class UpdateEmpFull
 */
@WebServlet("/UpdateEmpFull")
public class UpdateEmpFull extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmpFull() {
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
		String ename=request.getParameter("ename");
		String job=request.getParameter("job");
		int mgr=Integer.parseInt(request.getParameter("mgr"));
		String hiredate=request.getParameter("hiredate").toString();
		double sal=Double.parseDouble(request.getParameter("sal"));
		double comm=Double.parseDouble(request.getParameter("comm"));
		int deptno=Integer.parseInt(request.getParameter("deptno"));
		//Emp emp=new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
		EmpDao dao=new EmpDaoImpl();
		int rows=dao. UpdateEmpFull(ename, job,mgr, hiredate, sal, comm,deptno, empno);
	
		if(rows>0)
		out.println("updated");
		else
			out.println("Not updated");
		
	}

}
