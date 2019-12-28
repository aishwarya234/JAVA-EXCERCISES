
public class ClassOneApplication extends ClassOne{


	public ClassOneApplication(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public void disp(){
		System.out.println("Shows the demonstration of using abstract class by inheriting it");
	}
	
	
	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("derived cls");
		
	}
	public static void main(String[] args){
		ClassOne c=new ClassOneApplication(3,4);
		c.output();
		ClassOneApplication c1=new ClassOneApplication(5, 5);
		c1.disp();
		
	}
}