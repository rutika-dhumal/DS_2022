package com.ds.book.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.ds.book.BookTest;

public class BookSerialization {
	public static void main(String[] args) {
		
		BookTest bt = new BookTest("Java",12,"James","1.8",300,450f);
		System.out.println("Object created...");
		
		
		try {
			FileOutputStream fout  = new FileOutputStream("D://abc.txt");
			System.out.println("File is ready...");
			
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			System.out.println("Object stream is ready....");
			
			System.out.println("Trying to store the object...");
			oos.writeObject(bt);
			System.out.println("Object stored....");
			
			oos.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
