// Abstract class and methods

public class AbstractTest {
	public static void main(String[] args) {
		Vehicle v= new Bike();
		v.speed();
		
		Car car = new Car();
		car.speed();
	}
}


abstract class Vehicle{
	abstract void speed();
}

class Car extends Vehicle{
	void speed() {
		System.out.println("Average is speed is 50-100km/hr");
	}
}

class Bike extends Vehicle{
	void speed() {
		System.out.println("Average is speed is 30-50km/hr");
	}
}