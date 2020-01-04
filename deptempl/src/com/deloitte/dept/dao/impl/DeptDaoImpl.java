package com.deloitte.dept.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.dept.beans.Dept;
import com.deloitte.dept.dao.DeptDao;
import com.deloitte.dept.utils.DeptUtils;
import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.util.ConvertDate;
import com.deloitte.empl.util.EmpUtils;

import oracle.jdbc.OracleDriver;
//The implementation for DAO of Dept
public class DeptDaoImpl implements DeptDao{
	private Connection conn=null;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public void openConnection () {
		try {
			DriverManager.registerDriver(new OracleDriver());
			String url ="jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pass = "tiger";
			conn = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}
	@Override
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	@Override
	public int addEmpToDept(Dept dept) {
		openConnection();
		int rowsdept=0;
		try {
			pst = conn.prepareStatement(DeptUtils.insertqry);
			pst.setInt(1, dept.getDeptno());
			pst.setString(2, dept.getDname());
			pst.setString(3, dept.getLoc());
			
			rowsdept= pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			close();
		}
		return rowsdept;
	}
	
	
	
	@Override
	public List<Dept> getEmpls() {
		openConnection();
		List<Dept> deptlist = new ArrayList<Dept>();
		try {
			pst = conn.prepareStatement(DeptUtils.GETEMPLS);
			rs = pst.executeQuery();
			while(rs.next()){
				Dept dept = new Dept(rs.getInt(1),rs.getString(2),rs.getString(3));
							deptlist.add(dept);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return deptlist;
	}
	@Override
	public int deleteEmpFromDept(int deptno) {
		// TODO Auto-generated method stub
		openConnection();
		int rowsdept=0;
		try {
			pst = conn.prepareStatement(DeptUtils.deleteqry);
			pst.setInt(1,deptno);
			rowsdept= pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			close();
		}
		return rowsdept;
	}
}
