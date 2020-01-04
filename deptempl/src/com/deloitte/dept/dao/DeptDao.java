package com.deloitte.dept.dao;

import java.util.List;

import com.deloitte.dept.beans.Dept;
//THe DAO for dept
public interface DeptDao {

	void openConnection();
	void close();
	int deleteEmpFromDept(int deptno);
	List<Dept> getEmpls();
	//Emp getEmpByCode(int empcode);
	//void updateEmp(int empno,double comm );
	int addEmpToDept(Dept dept);
}
