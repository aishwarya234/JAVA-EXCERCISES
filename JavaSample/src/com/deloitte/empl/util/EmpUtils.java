package com.deloitte.empl.util;

public class EmpUtils {
	public static String insertqry="insert into emp values(?,?,?,?,?,?,?,?)";
	public static final String GETEMPLS = "select * from emp";
	public static final String GETEMPlBYCODE = "select * from emp where empno=?";
	public static String deleteqry="Delete from emp where EMPNO=?";
	public static String updateqry="update emp set sal=? where empno=?";
	public static String updatefullqry="update emp set ename=? ,job=? ,mgr=? ,hiredate=? ,sal=?, comm=? ,deptno=? where empno=?";
	

}


