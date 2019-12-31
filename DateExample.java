package datelearning;
import java.util.Date;

import java.text.SimpleDateFormat;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dob="31-12-2019";
		Date dt=new Date();
		System.out.println(dt);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		try{
		dt=sdf.parse(dob);
		System.out.println(dt);}
		
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
