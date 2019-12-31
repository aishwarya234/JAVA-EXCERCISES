package ObjectAndFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream  fos;
		try {
			fos=new FileOutputStream("D:\\samples\\customer");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Customer customer1=new Customer(101,"deloitte",5000);
			Customer customer2=new Customer(102,"nexwave",6000);
			oos.writeObject(customer1);
			oos.writeObject(customer2);
			oos.close();
			fos.close();
			System.out.println("ok");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
