package collectionlearnig;
import java.security.AccessControlContext;
import java.util.ArrayList;
import java.util.Iterator;

import javax.security.auth.login.AccountNotFoundException;

 class AccountOperations {
	Account[] accounts = new Account[5];
	public AccountOperations() {
		accounts[0] = new Account(10011, "ANU", 8000);
		accounts[1] = new Account(10012, "ACHU", 18000);
		accounts[2] = new Account(10022, "SACHU", 28000);
		accounts[3] = new Account(100133, "KICHU", 5600);
		accounts[4] = new Account(100223, "CHINTU", 15000);


	}
	
	
	//this function throws an exception if the account is not found,else will deposit the amount
	void deposit(int acno,double amount){
		
		
		int flag=0;
		for(int i=0;i<accounts.length;i++){
			if(acno==accounts[i].getAccno()){
				flag=1;
				double curr=accounts[i].getBalance();
				accounts[i].setBalance(amount+curr);					
	}	
 }
			try{
				if(flag==0)
					throw new AccountNumberNotFoundException();
					System.out.println("Successfully deposited the amount");
				}
			catch(AccountNumberNotFoundException e){
				System.out.println(e.getMessage());
			}
			
}
	
	//Withdraw function checks if the account number is valid and also if sufficient balance is there
	void withdraw(int acno,double amount)
	{
		
		int flag=0;
		for(int i=0;i<accounts.length;i++){
			if(acno==accounts[i].getAccno()){
				flag=1;
				try{
				if(amount>accounts[i].getBalance())
					throw new InsufficientBalanceException();
				if(amount<accounts[i].getBalance()){
			double curr=accounts[i].getBalance();
				accounts[i].setBalance(curr-amount);
				System.out.println("Withdrawal is successful");}
			
				}
				
				catch(InsufficientBalanceException e){
					System.out.println(e.getMessage());
				}	
			
		
			}
		
		
				try{
					if(flag==0)
						throw new AccountNumberNotFoundException();
						//System.out.println("Successfully deposited the amount");
				}
				catch(AccountNumberNotFoundException e){
					System.out.println(e.getMessage());
				}

				}	}
	
	
	
	
	//this function tells the user his balance
	void checkBalance(int acno){
		int flag=0;
		for(int i=0;i<accounts.length;i++){
			if(acno==accounts[i].getAccno()){
				
				flag=1;
				System.out.println("Sir/Madam your account balance is"+accounts[i].getBalance());
			}
			}
			
			try{
				if(flag==0)
					throw new AccountNumberNotFoundException();
					System.out.println("Successfully deposited the amount");
				}
			catch(AccountNumberNotFoundException e){
				System.out.println(e.getMessage());
			}
	}
	
	
}
