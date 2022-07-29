// serialize it via hashset
//import ds.com.book.serialize.BookSerialization;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;

//public class BookTest{
//	public static void main(String[] args) {
//
//		Book1 book1 = new Book1("Java",12,"James","1.8",300,450f);
//		Book1 book2 = new Book1("Java",12,"James","1.9",300,450f);
//		Book1 book3 = book1;
//		
//		System.out.println("book1 : "+book1);
//		System.out.println("book2 : "+book2);
//		System.out.println("book3 : "+book3);
//
//		System.out.println("----");
//		
//		System.out.println("book1 : "+book1.hashCode());
//		System.out.println("book2 : "+book2.hashCode());
//		System.out.println("book3 : "+book3.hashCode());
//
//		
//		HashSet<Book1> bookShelf = new HashSet<Book1>();
//		
//		System.out.println("Adding book1 ");
//		bookShelf.add(book1);
//		
//		System.out.println("Adding book2 ");
//		bookShelf.add(book2);
//
//		System.out.println("Adding book3 ");
//		bookShelf.add(book3);
//			
//		
//		for (Book1 book : bookShelf) {
//			System.out.println("The Book : "+book);
//		}
//		
//		
////		try {
////			FileOutputStream fout  = new FileOutputStream("D://Book.txt");
////			System.out.println("File is ready...");
////			
////			ObjectOutputStream oos = new ObjectOutputStream(fout);
////			System.out.println("Object stream is ready....");
////			
////			System.out.println("Trying to store the object...");
////			oos.writeObject(book2);
////			System.out.println("Object stored....");
////			
////			oos.close();
////			fout.close();
////		} catch (FileNotFoundException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		
////	}
//}

public class BookTest implements Serializable
{
	String title;
	int bookNumber;
	String bookAuthor;
	String edition;
	int numberOfPages;
	float price;
	
	public BookTest(String title, int bookNumber, String bookAuthor, String edition, int numberOfPages, float price) {
		super();
		this.title = title;
		this.bookNumber = bookNumber;
		this.bookAuthor = bookAuthor;
		this.edition = edition;
		this.numberOfPages = numberOfPages;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", bookNumber=" + bookNumber + ", bookAuthor=" + bookAuthor + ", edition="
				+ edition + ", numberOfPages=" + numberOfPages + ", price=" + price + "]";
	}

	/*@Override
	public int hashCode() {
		return Objects.hash(bookAuthor, bookNumber, edition, numberOfPages, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookTest other = (BookTest) obj;
		return Objects.equals(bookAuthor, other.bookAuthor) && bookNumber == other.bookNumber
				&& Objects.equals(edition, other.edition) && numberOfPages == other.numberOfPages
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price)
				&& Objects.equals(title, other.title);
	}*/
	
}	


// innovate comparator interface 
// innovate tree map 
// serialize this books via hashset