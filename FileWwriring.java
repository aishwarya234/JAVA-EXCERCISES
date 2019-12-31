package FilesLearning;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWwriring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("D:\\samples");
		file.mkdir();
		try{
		  FileOuttream fos=putSnew FileOutputStream("D:\\samples\\resume");
		for(int i=65;i<99;i++)
			fos.write(i);
		fos.close();
		System.out.println("success");}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
	}