package FilesLearning;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
		
				FileInputStream fis=new FileInputStream("D:\\samples\\resume");
				FileOutputStream fos=new FileOutputStream("D:\\samples\\rescopy");
				int x;
				while((x=fis.read())!=-1)
					fos.write(x);
				System.out.println("Successeful copying");
				fis.close();
				fos.close();
			}
			
			catch(IOException e){
				e.printStackTrace();
			}

		
		

	}

}
