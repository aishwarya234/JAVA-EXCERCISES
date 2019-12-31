package FilesLearning;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis=new FileInputStream("D:\\samples\\resume");
			int x;
			while((x=fis.read())!=-1)
				System.out.println((char)x);
			fis.close();
		}
		
		catch(IOException e){
			e.printStackTrace();
		}
		
		

	}

}
