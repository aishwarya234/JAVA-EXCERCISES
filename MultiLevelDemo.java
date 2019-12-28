
public class MultiLevelDemo {
public static void main(String args[]){
	Student stu=new Student();
	stu.display();
	StudentExam s=new StudentExam(1,"Mani", "CSE", 34, 40, 60);
	s.show();
	s.display();
	stu=s;
	stu.display();
}
}
