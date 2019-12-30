package interfaceUnderstanding;
import assesment1.*;

//this calss doesn't use the keyword implements instead uses the llambda expression
public class ArithmeticApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reduces complexity when the interface has only one abstract method
		Arithmetic arithmetic=(x,y)->{
			System.out.println("ADDs two numbera");
			return x+y+10;
		};
		System.out.println(arithmetic.add(10,50));
		arithmetic.output();
		
		Circle circle=new Circle(4);
		circle.area();
		
	}

}
