
public class FunctionTypeTest {
	
	public static void main(String[] args) {
		
		
		Addition addObj = new Addition();
		addObj.add();
		addObj.addInt(10, 34);
		double floatAdd = addObj.addFloat(34.0f, 50.65f);
		System.out.println(floatAdd);
		double ans = addObj.add4();
		System.out.println(ans);
	}

}



class Addition
{
	void add() 
	{
		System.out.println("Addition");
		System.out.println("---------------------");
	}
	
	
	void addInt(int x,int y) {
		int z = x+y;
		System.out.println("Addition is : "+z);
		System.out.println("---------------------");
	}
	
	double addFloat(float a , float b) 
	{
		System.out.println("---------------------");
		return a+b;
		
	}
	
	double add4() 
	{
		System.out.println("---------------------");
		return 34.689 + 56.87;
	}
}
