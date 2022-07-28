import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// file byte based FileInputStream

class MyFileReader{
	FileInputStream fin;

	public MyFileReader(String fileName) {
		
		System.out.println("Trying to open file....");
		try {
			fin = new FileInputStream(fileName);
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Problem1 : "+e);
		}
		System.out.println("file is open.......");
	}
	
	
	void readFileData() {
		try {
			byte b=(byte) fin.read();
			while(b!=-1) { //-1 means EOF
				System.out.print((char)b);
				b=(byte) fin.read(); // read successive letters from pos2
				Thread.sleep(100);
			}
		}
		catch (IOException e) {
			System.out.println("Problem 2: "+e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem 3: "+e);
		}
	}
	
	
	void closeFile() {
		System.out.println("\nTrying to close the file...");
		try {
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem3 : "+e);
		}
		System.out.println("File is closed..");
	}
}


public class FileHandlingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFileReader mfr1 = new MyFileReader("D:\\abc.txt");
		mfr1.readFileData();
		mfr1.closeFile();
//		MyFileReader mfr2 = new MyFileReader("D:\\abz.txt");
//		mfr2.readFileData();
	}

}
