
public class StaticDemo {
	static int x=55;
	int y=90;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
		//System.out.println(y); since y is not static it cannot be accessed simply
		StaticDemo s=new StaticDemo();
		System.out.println(s.y);
		
	}

}
