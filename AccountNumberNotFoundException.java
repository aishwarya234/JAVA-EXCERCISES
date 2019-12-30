package collectionlearnig;
//this is the one to handle the case when user enters a wrong accountnumber
public class AccountNumberNotFoundException extends Exception {

	public AccountNumberNotFoundException() {
		super("The specified Account Number is not found");
		// TODO Auto-generated constructor stub
	}
	
	

}
