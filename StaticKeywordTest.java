
// static keyword 

public class StaticKeywordTest {

	public static void main(String[] args) {
		Counter.increment();
		Counter.increment();
	}
}

class Counter{
	
	static int count;	
	int i;
	public static void increment(){

		count++;
		
//		cannot access non static inside static method
//		int j=i+count;
//		System.out.println("j is"+j);
		
		System.out.println("count is: " + count);

	}
}