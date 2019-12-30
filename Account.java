package collectionlearnig;

public class Account {
	private int accno;
	private String custname;
	private double balance;
	
	public Account() {
		super();
	}

	public Account(int accno, String custname, double balance) {
		super();
		this.accno = accno;
		this.custname = custname;
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
