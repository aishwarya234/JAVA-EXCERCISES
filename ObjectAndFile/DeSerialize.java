package ObjectAndFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream("D:\\samples\\customer");
			ois=new ObjectInputStream(fis);
			Object obj = new Object();
			while((obj=ois.readObject())!=null){
				Customer cust = (Customer) obj;
				System.out.println(cust.getCustid()+" "+cust.getCustname()+" "+cust.getAommn());
			}}
				
		 catch (IOException |ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			System.out.println("Done");
		}
	}
	


