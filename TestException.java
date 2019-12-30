package exceptionlearning;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=9;
		int y=0;
		int[] a={1,2,3,4};
		try{
			int s=x/y;
			System.out.println("result="+s);
			System.out.println("value="+a[33]);
		}
		
		
		catch(ArithmeticException | IndexOutOfBoundsException e){

			e.printStackTrace();
			//e.getMessage();
			//System.out.println("division by zero");
		}
		
		//catch(IndexOutOfBoundsException e){
		//	System.out.println("array out of bound");
		//}
		
		System.out.println("successful");
	}

}
