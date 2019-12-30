package exceptionlearning;

public class UserDefinedExample {
	public static void main(String[] args){
	int empcode=123;
	int code=Integer.parseInt(args[0]);
	
	try{
		if(empcode!=code)
			throw new EmployeeNotFoundException();
			System.out.println("Employee exists)");
	}
	
	
	catch(EmployeeNotFoundException e){
		//e.printStackTrace();
		System.out.println(e.getMessage());
	}
}
}