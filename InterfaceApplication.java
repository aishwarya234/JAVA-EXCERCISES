package interfaceUnderstanding;

public class InterfaceApplication implements One,Three{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Method One");
	}
	
	
	public static void main(String[] args){
		
		One one =new InterfaceApplication();
		System.out.println(x);
		Two two=new InterfaceApplication();
		System.out.println(y);
		one.display();
		two.show();
		Three three=new InterfaceApplication();
		three.show();
		three.output();
	}


	


	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("Method 3");
		
	}


	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Method two");
	}

}
