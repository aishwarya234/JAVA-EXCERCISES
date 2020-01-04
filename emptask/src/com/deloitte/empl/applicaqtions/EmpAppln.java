package com.deloitte.empl.applicaqtions;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

public class EmpAppln {
	public static void main(String[] args) {
		
		Emp emp = new Emp(13,"aaa2","jo2b",465,"23-12-2019", 5000, 600, 30);
		EmpDao dao = new EmpDaoImpl();
		int rows = dao.addEmp(emp);
		if(rows>0)
			System.out.println("inserted");
		else
			System.out.println("not inserted");
		dao.deleteEmp(12);
		dao.updateEmp(7521,22);
	}
}
