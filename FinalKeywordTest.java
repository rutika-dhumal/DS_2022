
public class FinalKeywordTest {
	
	public static void main(String[] args) {
		Circle circle = new Circle();
//		final field cannot be assigned
//		circle.pi=23;
		System.out.println("area is : "+circle.area(2));
	}
	
	
}



class Circle{
	final float pi=3.14f;
	
	final float area(float radius) {
		float areaOfCircle = pi*radius*radius;
		return areaOfCircle;
	}
	
	
}



class Shape {
	final void draw() {
		System.out.println("drawing...");
	}
}


class Rectangle extends Shape{
	

//	cannot override method
//	void draw() {
//		System.out.println("circle is drwaing");
//	}
}
