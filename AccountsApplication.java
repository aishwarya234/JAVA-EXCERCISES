package collectionlearnig;
import java.util.Scanner;
public class AccountsApplication {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int ch;
		int acno;
		double amount;
		
		AccountOperations oper = new AccountOperations();
		int i=0;
		

		
		while(true){
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("OPERATIONS POSSIBLE");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.println();
			System.out.println("Enter your choice");
			ch=scanner.nextInt();
			switch(ch){
			case 1:System.out.println("Enter the account number");
					acno=scanner.nextInt();
					System.out.println("Enter the Amount");
					amount=scanner.nextDouble();
					
			
					oper.deposit(acno,amount);
					break;
			case 2:System.out.println("Enter the account number");
					acno=scanner.nextInt();
					System.out.println("Enter the Amount");
					amount=scanner.nextDouble();
					oper.withdraw(acno,amount);
					break;
			case 3: System.out.println("Enter the account number");
					acno=scanner.nextInt();
			
					oper.checkBalance(acno);
					break;
			case 4: 
					System.exit(0);
			
			
			}

		}
		
	}
}
