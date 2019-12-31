package JdbcUnderstanding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class RetrievingData {
	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		//InputStreamReader  isr=new InputStreamReader(System.in);
	// br=new BufferedReader(isr);
		OracleDriver driver=new OracleDriver();
		DriverManager.registerDriver(driver);		
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn=DriverManager.getConnection(url,"scott","tiger");
		System.out.println("Connected");
		String qry="Select * from demo";
		PreparedStatement pt=conn.prepareStatement(qry);
		ResultSet rs=pt.executeQuery();
		ResultSetMetaData rsmd=rs.getMetaData();
		for(int i=1;i<=rsmd.getColumnCount();i++)
			System.out.println(rsmd.getColumnName(i)+" ");
			System.out.println("\n------------------------------");
		while(rs.next())
			System.out.println(rs.getString(1)+" "+rs.getInt(2));

}}
