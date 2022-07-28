import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCreationTest {
	public static void main(String[] args) {
		try {
			System.out.println("Trying to create file");
			// whenever you call the function it will override data
//			FileOutputStream fout = new FileOutputStream("D://xyz.txt");
			
//			if you dont want to override the data and add content into the same file use boolean
			FileOutputStream fout = new FileOutputStream("D://xyz.txt",true);
			
			System.out.println("file is created");
			
			
			// to add contents in file
			
			
//			to add content directly into file
//			String str="add this data into xyz.txt file";
			
			
			Scanner s = new Scanner(System.in);
			System.out.println("enter data: ");
			String str = s.nextLine();
			System.out.println("got the data");
			
			byte byteArray[] = str.getBytes();
			System.out.println("converted string into byte array");
			
			fout.write(byteArray);
			System.out.println("byte array is written to file");
			
			fout.close();
			System.out.println("file is closed");
			
		} catch (FileNotFoundException e) {
			System.out.println("Problem 1 : "+e);
		} catch (IOException e) {
			System.out.println("Problem 2 : "+e);
		}
		
	}
}
