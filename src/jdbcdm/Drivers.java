package jdbcdm;
import java.sql.*;
public class Drivers {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		Connection myConn=null;
		PreparedStatement myStmt=null;
		ResultSet myRs=null;
try
{
	myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","test");
	myStmt=myConn.prepareStatement("select * from employees where salary>? and department=?");
	myStmt.setDouble(1,8000);
	myStmt.setString(2,"Legal");
	myRs=myStmt.executeQuery();
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}
