package Kaizen.ConstructorsinJava;

public class Car {
	String Car_color;
	String Car_model;
	String Car_Company;

	public Car() {
		System.out.println("Testing");
	}

	public Car(String Car_color, String Car_model, String Car_Company) {

		this.Car_color = Car_color;
		this.Car_model = Car_model;
		this.Car_Company = Car_Company;

	}

	public void display() {
		System.out.println(
				"Car [Car_color=" + Car_color + ", Car_model=" + Car_model + ", Car_Company=" + Car_Company + "]");
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.display();

		Car ford = new Car("red", "Mustang", "Ford");
		ford.display();

		Car volksvagen = new Car("White", "Golf", "Volksvagen");
		volksvagen.display();

		Car Hyundai = new Car("Black", "i10", "Hyundai");
		Hyundai.display();

	}
}
