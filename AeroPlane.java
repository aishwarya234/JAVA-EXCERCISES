package interfaceUnderstanding;

//Aeroplne class implements vehicle because aeroplane is a vehicle and has engines and wheels
public class AeroPlane implements Vehicle{

	//overriding the methods present in the implemented interface
	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("AEROPLANE HAS 3 WHEELS");
		
	}

	@Override
	public void engines() {
		// TODO Auto-generated method stub
		System.out.println("AEROPLANE HAS 4 ENGINES");
	}
		public static void main(String[] args){
			Vehicle vehicle=new AeroPlane();
			vehicle.engines();
			vehicle.wheels();
		}
}
