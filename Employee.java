package collectionlearnig;

public class Employee {
	private int empCode;
	private String empName;
	private double empSalary;
	
	
	
	public Employee(int empCode, String empName, double empSalary) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	

}
