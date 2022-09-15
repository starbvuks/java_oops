package labfive;

class Vehicle {
	int maxSpeed = 120;
}

class Car extends Vehicle {
	int maxSpeed = 180;
	void display() {
		System.out.print("Max Speed: " + super.maxSpeed);
	}
}

public class Supervariable {
	public static void main(String[] args) {
		Car small = new Car();
		small.display();
	}
}
