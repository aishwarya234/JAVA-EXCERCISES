
public class MethodOverloading {
		void add(int x,int y){
		System.out.println("int "+(x+y));}
		void add(double x,double y){
			System.out.println("double  "+(x+y));}
			void add(String x,String y){
				System.out.println("String  "+(x+y));
			}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MethodOverloading methods=new MethodOverloading();
			methods.add("ff","gg y");
			methods.add(2,77);
			methods.add(55.0,78);
	}

}
