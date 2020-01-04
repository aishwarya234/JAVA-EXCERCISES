package com.deloitte.empl.dao;
import com.deloitte.empl.beans.*;
import java.util.List;

public interface EmpDao {
	void openConnection();
	void close();
	int addEmp(Emp emp); 
	int deleteEmp(int empno);
	List<Emp> getEmpls();
	Emp getEmpByCode(int empcode);
	void updateEmp(int empno,double comm );
}
