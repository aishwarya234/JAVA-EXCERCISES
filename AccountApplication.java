
public class AccountApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account(234,"anu",88888);
		Account account2=new Account();
		//account.setAccountNumber(45);
	//	account.setBalance(4500);
		//account.setCustomerName("Aami");
		System.out.println(account.getAccountNumber());
		System.out.println(account.getBalance());

		System.out.println(account2.getCustomerName());
		
		
		
		
	}

}
