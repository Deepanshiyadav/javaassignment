package Kaizen.ConstructorsinJava;

public class Employee {
	String name;
	int age;
	String qualification;
	String post;
	String destination;

	public Employee() {
		System.out.println("Employee");
	}

	public Employee(String name, int age, String qualification, String post, String destination) {
		this.name = name;
		this.age = age;
		this.qualification = qualification;
		this.post = post;
		this.destination = destination;
	}

	public void show() {
		System.out.println("Employee [name=" + name + ", age=" + age + ", qualification=" + qualification + ", post="
				+ post + ", destination=" + destination + "]");
	}

	public static void main(String[] args) {
		Employee Employee = new Employee();
		Employee.show();

		Employee Employee1 = new Employee("Pankaj", 25, "MCA", "Manager", "Indore");
		Employee1.show();

		Employee Employee2 = new Employee("Kriti", 24, "BBA", "marketing", "Indore");
		Employee2.show();

		Employee Employee3 = new Employee("Pooja", 27, "MBA", "Head of marketing department", "Indore");
		Employee3.show();

	}

}
