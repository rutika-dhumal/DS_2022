package com.ds.book.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import com.ds.book.BookTest;

public class BookDeserialization {

		public static void main(String[] args) {
			
			BookTest bt = new BookTest("Java",12,"James","1.8",300,450f);
			System.out.println("Object is null...");
			
			try {
				FileInputStream fin  = new FileInputStream("D://Book.txt");
				System.out.println("File is ready..for reading.....");
				
				ObjectInputStream ois = new ObjectInputStream(fin);
				System.out.println("Object stream is ready...for reading object.");
				
				System.out.println("Trying to retrieve the object...");
				bt = (BookTest) ois.readObject();
				System.out.println("Object retrieved....");
				
				System.out.println("bt is : "+bt);
				
				ois.close();
				fin.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
			
		}
	
}
