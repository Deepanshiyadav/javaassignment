package staticinJava;

public class Employee {

	String Name;
	static int nextId = 100;

	Employee(String Name) {
		this.Name = Name;
		nextId++;
	}

	public void show() {
		System.out.print("Employee Name: " + Name + "      ");
		System.out.println("Employee ID: " + nextId);
	}

	public static void main(String[] args) {
		Employee e = new Employee("Aayush");
		e.show();

		Employee e1 = new Employee("Rohit");
		e1.show();

		Employee e2 = new Employee("Payal");
		e2.show();

		Employee e3 = new Employee("Prabh");
		e3.show();

	}

}
