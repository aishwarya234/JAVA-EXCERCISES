package exceptionlearning;

public class EmployeeNotFoundException extends Exception {
	public EmployeeNotFoundException(){
		super("Employeee not found in th list");
	}

}
