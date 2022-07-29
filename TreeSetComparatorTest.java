import java.util.TreeSet;

public class TreeSetComparatorTest {
	public static void main(String[] args) {
		Student s1 = new Student(12, "riya", "pune");
		Student s2 = new Student(11, "rutu", "pune");
		Student s3 = new Student(2, "snehal", "delhi");
		
		TreeSet<Student> studentList = new TreeSet<Student>();
		
		System.out.println("Added 1st student");
		studentList.add(s1);
		System.out.println("Added 2nd student");
		studentList.add(s2);
		System.out.println("Added 3rd student");
		studentList.add(s3);
		
		System.out.println("-----------------");
		
		for (Student student : studentList) {
			System.out.println("student is : "+student);
		}
		System.out.println("-----------------");
		
	}
}


class Student implements Comparable<Student>{
	int rollNumber;
	String name;
	String address;
	
	public Student(int rollNumber, String name, String address) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address + "]";
	}
	
	public int compareTo(Student o) {
		System.out.println("comparing "+ rollNumber+" with "+ o.rollNumber);
		return Integer.compare( rollNumber ,o.rollNumber);
	}
	
	
	
}


// collection.sort()  takes comparator as an argument in ArrayList