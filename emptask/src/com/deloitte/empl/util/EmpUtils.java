package com.deloitte.empl.util;

public class EmpUtils {
	public static String insertqry="insert into emp values(?,?,?,?,?,?,?,?)";
	public static final String GETEMPLS = "select * from emp";
	public static final String GETEMPlBYCODE = "select * from emp where empno=?";
	public static String deleteqry="Delete from emp where EMPNO=?";
	public static String updateqry="update emp set comm=? where empno=?";

}


