// InserStudent SelectStudent StudentModify SelectWhereTest

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class InsertStudent {
	public static void main(String[] args) throws  StudentAlreadyExistsException {
		
		
		try {
			System.out.println("Registering driver...");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered...");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("connected to db.."+conn);
			
			System.out.println("Tring to make a prepared statement");
			PreparedStatement pst = conn.prepareStatement("INSERT INTO STUDENT VALUES (?,?,?,?,?,?,?,?);");
			System.out.println("Prepared Statement created..."+pst);
			
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter student roll no : ");
			int rno = scan1.nextInt();
			
			Statement st  = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM STUDENT WHERE ROLLNO="+rno);
			
			if(rs.next()) {
				StudentAlreadyExistsException ex = new StudentAlreadyExistsException("this Student is already exists "+rno);
				throw ex;
			}
					
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Enter student name   : ");
			String sname = scan2.next();
			
			Scanner scan3 = new Scanner(System.in);
			System.out.println("Enter birthdate : ");
//			String bdate= scan3.next();
			String bdate= scan3.next();
			Date date = Date.valueOf(bdate);
			
			
			
			Scanner scan4 = new Scanner(System.in);
			System.out.println("Enter physics marks   : ");
			int phy = scan4.nextInt();
			
			Scanner scan5 = new Scanner(System.in);
			System.out.println("Enter chemistry marks  : ");
			int chem = scan5.nextInt();
			
			Scanner scan6 = new Scanner(System.in);
			System.out.println("Enter maths : ");
			int math = scan6.nextInt();
	
			
			int total = phy+chem+math; 

			
			String grade="";
			int avg = total/3;
			if(total>85) {
				grade="A";
			}
			else if(total>60 && total<85) {
				grade="B";
			}
			else if( total>35 && total<60) {
				grade="C";
			}
			else {
				grade="F";
			}
			
			
//			roll number, student name, birthdate, physics, chemistry, maths, total, grade
			
				pst.setInt(1, rno);//fill up the question mark with its value
				pst.setString(2, sname);
				pst.setDate(3, date);
//				pst.setString(3, bdate);
				pst.setInt(4, phy);
				pst.setInt(5, chem);
				pst.setInt(6, math);
				pst.setInt(7, total);
				pst.setString(8, grade);
			
				
			System.out.println("Trying to execute the prepared statement....");
			int rows = pst.executeUpdate();
			
			System.out.println("Prepred Statement executed, inserted the records :..."+rows);
				
			
			pst.close();	
			conn.close();	
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}



