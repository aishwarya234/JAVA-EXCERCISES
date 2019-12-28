import org.omg.CORBA.PRIVATE_MEMBER;

public class Account {


		// TODO Auto-generated method stub
		private int accountNumber;
		private String customerName;
		private double balance;
		
		
	/*	public Account(){
			accountNumber=123;
			customerName="veera";
			balance=4567
		}*/
		
		
		public int getAccountNumber() {
			return accountNumber;
		}
		public Account() {
			super();
		}
		public Account(int accountNumber, String customerName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}

		
	}





