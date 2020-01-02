package ObjectAndFile;

import java.io.Serializable;

public class Customer implements Serializable {
	
	private static final long serialVersionUID=1L;
	private int custid;
    private String custname;
    private double aommn;
	public Customer(int custid, String custname, double aommn) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.aommn = aommn;
	}
	
	public Customer(){}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public double getAommn() {
		return aommn;
	}

	public void setAommn(double aommn) {
		this.aommn = aommn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
