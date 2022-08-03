
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class SelectWhereTest {
	public static void main(String[] args) throws StudentNotFoundException {
		
		
		try {
			System.out.println("Registering driver...");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered...");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("connected to db.."+conn);
			
			System.out.println("Tring to make a statement");
			Statement statement = conn.createStatement();
			System.out.println("Statement created..."+statement);
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the student number : ");
			int rno = scanner.nextInt();
			
			
			System.out.println("Trying to execute the statement...");
			ResultSet rs= statement.executeQuery("SELECT * FROM STUDENT WHERE ROLLNO="+rno);
			System.out.println("Statement executed, got the result...");
			
		
			
			if(rs.next()) {
				int rollno = rs.getInt(1);
				String sname = rs.getString(2);
				Date bdate = rs.getDate(3);
				int phy = rs.getInt(4);
				int chem = rs.getInt(5);
				int math = rs.getInt(6);
				int total = rs.getInt(7);
				String grade = rs.getString(8);
				
				System.out.println("ROLL NO  : "+ rollno);
				System.out.println("STUDENT NAME : "+sname);
				System.out.println("BIRTHDATE  : "+bdate);
				System.out.println("PHYSICS    : "+phy);
				System.out.println("CEHMISTRY : "+chem);
				System.out.println("MATH  : "+math);
				System.out.println("TOTAL   : "+total);
				System.out.println("GRADE : "+ grade);
				
				System.out.println("-------------------");
			}
			
			else {
				StudentNotFoundException empNtFndEx = new  StudentNotFoundException("Student not found : "+rno);
				throw empNtFndEx;
			}
			
			rs.close();
			statement.close();
			conn.close();			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
