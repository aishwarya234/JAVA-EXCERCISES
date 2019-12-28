
public class StudentExam extends Library{
	int sub1;
	int sub2;
	
	
	public StudentExam(int regNo, String stdName, String group, float booksDue, int sub1, int sub2) {
		super(regNo, stdName, group, booksDue);
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
	void  show(){
		System.out.println(regNo+group+stdName+sub1+sub2+booksDue);
	}
	
	public void display(){
		 System.out.println("subclasss");
	 }
	void calc(){
		int total;
		total=sub1+sub2;
		System.out.println(total);
	}
}
