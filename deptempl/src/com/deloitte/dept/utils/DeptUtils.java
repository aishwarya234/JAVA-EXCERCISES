package com.deloitte.dept.utils;
//All the frequently used  queries are complied
public class DeptUtils {
	public static String insertqry="insert into dept values(?,?,?)";
	public static final String GETEMPLS = "select * from  dept";
	public static final String GETEMPlBYCODE = "select * from dept where deptno=?";
	public static String deleteqry="Delete from dept where deptno=?";
	public static String updateqry="update emp set comm=? where empno=?";
}
