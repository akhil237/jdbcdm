package jdbcdm;
import java.sql.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/demo";
		String user="root";
		String password="test";
		try
		{
		Connection myConn=DriverManager.getConnection(url,user,password);
		Statement myStat=myConn.createStatement();
			String sql="delete from employees where last_name='Brove'";
			int rowA=myStat.executeUpdate(sql);
			System.out.println("rowAffected"+rowA);
			System.out.println("delete complete");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
