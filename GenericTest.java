public class GenericTest {
	public static void main(String[] args) {

		int x=10;
		int y=20;
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		
		swap(x,y); // the value of x, ie 10, the value of y, ie 20
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		
	}
	public static void swap(int x, int y) 
	{
		System.out.println("swapping.....");
		int temp = x;
		x = y;
		y = temp;
		System.out.println("swapped...");
	}
}



