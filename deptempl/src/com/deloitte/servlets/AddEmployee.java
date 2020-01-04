package com.deloitte.servlets;


		import java.io.IOException;
		import java.io.PrintWriter;

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
		 * Servlet implementation class AddEmp
		 */
		
		
		//The servlet where the action of adding entries to the dept and emp table take place
		@WebServlet("/AddEmployee")
		public class AddEmployee extends HttpServlet {
			private static final long serialVersionUID = 1L;
		       
		    /**
		     * @see HttpServlet#HttpServlet()
		     */
		    public AddEmployee() {
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
				
				//The parameters for emp object creation and dept obj creation
				int empno=Integer.parseInt(request.getParameter("empno"));
				String ename=request.getParameter("ename");
				String job=request.getParameter("job");
				int mgr=Integer.parseInt(request.getParameter("mgr"));
				String hiredate=request.getParameter("hiredate").toString();
				double sal=Double.parseDouble(request.getParameter("sal"));
				double comm=Double.parseDouble(request.getParameter("comm"));
				int deptno=Integer.parseInt(request.getParameter("deptno"));
				
				//extra parameters for Dept
				String dname=request.getParameter("dname");
				String loc=request.getParameter("loc");
				
				
				//Creation of Emp object which will be added to database
				Emp emp=new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				EmpDao dao=new EmpDaoImpl();
				
				
				//Creation of Deoparment object to be added to dept database
				Dept dept=new Dept(deptno, dname, loc);
				DeptDao dao1=new DeptDaoImpl();
				int rows=dao.addEmp(emp);
				if(rows>0)
				out.println("Inserted data to Emp table<br>");
				else
					out.println("Couldn't insert data to Emp table<br>");
				int rowsdept=dao1.addEmpToDept(dept);
				if(rowsdept>0)
				out.println("Inserted data to Department table");
				else
					out.println("Couldn't insert data to Department table");
				
				
				
				
				
			}

		

		
		
	}


