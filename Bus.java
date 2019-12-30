package interfaceUnderstanding;


public class Bus implements Vehicle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=new Bus();
		vehicle.engines();
		vehicle.wheels();

	}

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("BUS HAS 6 WHEELS");
		
	}

	@Override
	public void engines() {
		// TODO Auto-generated method stub
		System.out.println("BUS HAS 1 ENGINE ");
		
	}

}
