import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//file character based FileReader

class MyFileReader1{
	FileReader fr;

	public MyFileReader1(String fileName) {
		
		System.out.println("Trying to open file....");
		try {
			fr = new FileReader(fileName);
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Problem1 : "+e);
		}
		System.out.println("file is open.......");
	}
	
	
	void readFileData() {
		try {
			char c=(char) fr.read();
			while(c!=-1) { //-1 means EOF
				System.out.print(c);
				c= (char)fr.read(); // read successive letters from pos2
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
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem3 : "+e);
		}
		System.out.println("File is closed..");
	}
}


public class FileCharacterBasedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFileReader mfr1 = new MyFileReader("D:\\abc.txt");
		mfr1.readFileData();
		mfr1.closeFile();
//		MyFileReader mfr2 = new MyFileReader("D:\\abz.txt");
//		mfr2.readFileData();
	}

}
