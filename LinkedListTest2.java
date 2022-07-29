import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest2 {

	public static void main(String[] args) {
		
		System.out.println("Creating the content....");
		PhoneContact log1 = new PhoneContact("Riya","Pune","8876900067","8976545895","riya@gmail.com");
		PhoneContact log2 = new PhoneContact("Siya","Nashik","8869900067","8976567895","siya@gmail.com");
		PhoneContact log3 = new PhoneContact("Rita","Pune","8876970067","8976512895","abc@gmail.com");
		PhoneContact log4 = new PhoneContact("John","Satara","8812900067","8976567895","john@gmail.com");
		PhoneContact log5 = new PhoneContact("Akash","Delhi","8845690006","8976767895","akash@gmail.com");
		System.out.println("Content is creaeted....");
		
		System.out.println("Creating container....");
		LinkedList<PhoneContact> phoneContactList = new LinkedList<PhoneContact>();
		System.out.println("Container is ready....");
		
		System.out.println("Adding the 1 element....");
		phoneContactList.add(log1);
		
		System.out.println("Adding the 2 element....");
		phoneContactList.add(log2);
		
		System.out.println("Adding the 3 element....");
		phoneContactList.add(log3);
		
		System.out.println("Adding the 4 element....");
		phoneContactList.add(log4);
		
		System.out.println("Adding the 5 element....");
		phoneContactList.add(log5);
		
		System.out.println("---> Now iterating over the container <---");
		
		Iterator<PhoneContact> iterator = phoneContactList.iterator();
		
		while(iterator.hasNext()) {
			PhoneContact theContact = iterator.next();
			System.out.println("The Log : "+theContact);
		}
	}
}
class Contact
{
	String contactName;
	String contactAddress;
	public Contact(String contactName, String contactAddress) {
		super();
		this.contactName = contactName;
		this.contactAddress = contactAddress;
	}
	@Override
	public String toString() {
		return "Contact [contactName=" + contactName + ", contactAddress=" + contactAddress + "]";
	}
	
	
	
	
	
}

class PhoneContact extends Contact
{
	String contactNumber;
	String whatsappNumber;
	String emailAddress;
	public PhoneContact(String contactName, String contactAddress, String contactNumber, String whatsappNumber,
			String emailAddress) {
		super(contactName, contactAddress);
		this.contactNumber = contactNumber;
		this.whatsappNumber = whatsappNumber;
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "PhoneContact [toString()=" + super.toString() + ", contactNumber=" + contactNumber + ", whatsappNumber="
				+ whatsappNumber + ", emailAddress=" + emailAddress + "]";
	}
	
	
	
}
