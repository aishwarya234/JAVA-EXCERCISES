package collectionlearnig;
import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emplist=new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		emplist.add(new Employee(scanner.nextInt(),scanner.next(),scanner.nextDouble()));
		emplist.add(new Employee(scanner.nextInt(),scanner.next(),scanner.nextDouble()));
		emplist.add(new Employee(scanner.nextInt(),scanner.next(),scanner.nextDouble()));
		

		for(Employee emp:emplist)
			System.out.println(emp.getEmpCode()+" "+emp.getEmpName()+" "+emp.getEmpSalary());


	}

}
