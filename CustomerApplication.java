
public class CustomerApplication {
	public static void main(String[] args) {

			Customer customer=new Customer();
			customer.setCity("Cochin");
			customer.setCustomerId(100);
			customer.setCustomerName("Ashwin");
			System.out.println("Customer Id:"+customer.getCustomerId());
			System.out.println("Customer Name:"+customer.getCustomerName());
			System.out.println("Customer City:"+customer.getCity());
			
			
	}
	
}