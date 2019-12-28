
public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int regno=25;
		int sub1=24 ;
		int sub2=12;
		int sub3=45;
		int total=0;
		double average=0;
		
		if(sub1>40&&sub2>40&&sub3>40){
		
					total=sub1+sub2+sub3;
					
					average=total/3;
					
					System.out.println("The student"+regno+" has passed with percentage:"+average);
					
				
			}
			
			else{
				System.out.println("The student has failed");
			}
			
		}
		

}
