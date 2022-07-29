import java.util.HashSet;
import java.util.Objects;

public class HashSetTest {
	public static void main(String[] args) {

		Book book1 = new Book("Java",12,"James","1.8",300,450f);
		Book book2 = new Book("Java",12,"James","1.9",300,450f);
		Book book3 = book1;
		
		System.out.println("book1 : "+book1);
		System.out.println("book2 : "+book2);
		System.out.println("book3 : "+book3);

		System.out.println("----");
		
		System.out.println("book1 : "+book1.hashCode());
		System.out.println("book2 : "+book2.hashCode());
		System.out.println("book3 : "+book3.hashCode());

		
		HashSet<Book> bookShelf = new HashSet<Book>();
		
		System.out.println("Adding book1 ");
		bookShelf.add(book1);
		
		System.out.println("Adding book2 ");
		bookShelf.add(book2);

		System.out.println("Adding book3 ");
		bookShelf.add(book3);
			
		
		for (Book book : bookShelf) {
			System.out.println("The Book : "+book);
		}
	}
}

class Book
{
	String title;
	int bookNumber;
	String bookAuthor;
	String edition;
	int numberOfPages;
	float price;
	
	public Book(String title, int bookNumber, String bookAuthor, String edition, int numberOfPages, float price) {
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

	@Override
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
		Book other = (Book) obj;
		return Objects.equals(bookAuthor, other.bookAuthor) && bookNumber == other.bookNumber
				&& Objects.equals(edition, other.edition) && numberOfPages == other.numberOfPages
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price)
				&& Objects.equals(title, other.title);
	}
	
	
}

// innovate comparator interface 
// innovate tree map 
// serialize this books via hashset