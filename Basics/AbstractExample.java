

abstract class Vehicle{
	abstract void demo();
}
  	class Car extends Vehicle{
		void demo() {
			System.out.println("car start with powerButton");
		
		}
}

 	class Scooter extends Vehicle {
		void demo() {
			System.out.println("Scooty start with Self");
		}
	}

public class AbstractExample {
	public static void main(String[] args) {
		Car c = new Car();
		c.demo();
		Scooter s = new Scooter();
		s.demo();

	}
}

	

