package JdbcUnderstanding;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class TestDB {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		InputStreamReader  isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		OracleDriver driver=new OracleDriver();
		DriverManager.registerDriver(driver);		
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn=DriverManager.getConnection(url,"scott","tiger");
		System.out.println("Connected");
		//Statement st=conn.createStatement();
		/*String qry="insert into demo values('asd',4)";
		st.executeUpdate(qry);
		System.out.println("Inseryted rows");*/
		
		/*for(int i=0;i<3;i++){
		String qry1="insert into demo values(?,?)";
		PreparedStatement pst=conn.prepareStatement(qry1);
		try {
			System.out.println("Enter the demo name");
			String demoname=br.readLine();
			pst.setString(1, demoname);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			System.out.println("Enter demo code");
			int code=Integer.parseInt(br.readLine());
			pst.setInt(2, code);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pst.execute();
		

		
		}
		
		
		
		System.out.println("Insertion completed");*/
		/*PreparedStatement p=conn.prepareStatement(qry1);
		p.setString(1, "asha");
		p.setInt(2, 35);
		p.execute();
		int rows=pst.executeUpdate();
		System.out.println("rows="+rows);*/
		
		String qry="update  demo set name=? where code=?";
		PreparedStatement pt=conn.prepareStatement(qry);
		pt.setString(1, "Nikki");
		pt.setInt(2, 4);
		pt.execute();
		
		String q="delete from demo where code=?";
		PreparedStatement p=conn.prepareStatement(q);
		p.setInt(1, 1);
		p.execute();
		conn.close();
		
		

	}

}
