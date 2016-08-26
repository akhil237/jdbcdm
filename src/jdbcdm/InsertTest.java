package jdbcdm;
import java.sql.*;
import java.util.Scanner;
public class InsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","root","test");
PreparedStatement stmt=con.prepareStatement("insert int emp(name,job,salary)"+"value(?,?,?)");
Scanner in=new Scanner(System.in);
while(true)
{
System.out.println("Enter the name");
String n=in.nextLine();
System.out.println("Enter the job");
String j=in.nextLine();
System.out.println("Enter the salary");
int s=in.nextInt();
stmt.setString(1,n);
stmt.setString(2,j);
stmt.setInt(3,s);
stmt.executeQuery();
System.out.println("Want to isnert more record yes/no");
String ans=in.nextLine();
if(ans.equalsIgnoreCase("no"))
	break;
}
con.close();
System.out.println("successful save");
}
	catch(Exception e)
{
	System.out.println(e);
}
}
}