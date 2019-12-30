package collectionlearnig;
//to handle the case when the user attempts to withdraw an amount greater than his capacity
public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		// TODO Auto-generated constructor stub
		super("Sorry , your account has insufficient balance");
	}
}
