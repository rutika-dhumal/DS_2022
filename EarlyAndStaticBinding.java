
public class EarlyAndStaticBinding {
	public static void main( String args[ ])
	  {
	    Animal animal = new Animal();
	    animal.eat();
	    
	    Animal a = new Dog();
	    a.eat();
	  }
}

class Animal
{
  public static void eat()
  {
    System.out.println("Animal eating...");
  }
}

class Dog extends Animal
{
  public static void eat()
  {
    System.out.println("Dog Eating...");
  }
}

class Puppy extends Dog{
	public static void eat()
	  {
	    System.out.println("Puppy Eating...");
	  }
}