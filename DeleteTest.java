
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DeleteTest {
	public static void main(String[] args) throws StudentNotFoundException {
		
		
		try {
			System.out.println("Registering driver...");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered...");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("connected to db.."+conn);
			
			
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter roll number to delete: ");
			int rno = scan1.nextInt();
			
			Statement st  = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM STUDENT WHERE ROLLNO="+rno);
			
			if(rs.next()) {
				
				System.out.println("Tring to make a prepared statement");
				PreparedStatement pst = conn.prepareStatement("DELETE FROM STUDENT WHERE ROLLNO=? ");
				System.out.println("Prepared Statement created..."+pst);
				
				pst.setInt(1, rno);
				
				System.out.println("Trying to execute the prepared statement....");
				int rows = pst.executeUpdate();
				
				System.out.println("Prepred Statement executed, deleted2 the records :..."+rows);
				
				pst.close();	
				conn.close();	
				
			}
			else {
				StudentNotFoundException stdNotFndEx = new StudentNotFoundException("Student does not found "+rno);
				throw stdNotFndEx;
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}



