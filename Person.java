package javaAssignmentAssignment6;

public class Person {
	String name;
	int age;
	String city;
	String gender;

	public void eat() {
		System.out.println("eating");
	}

	public void sleep() {
		System.out.println("sleeping");
	}

	public void play() {
		System.out.println("playing");
	}

	public void study() {
		System.out.println("studying");
	}

	public Person() {
		System.out.println("Testing");
	}

	public Person(String name, int age, String city, String gender) {
		System.out.println("Testing2");
		this.name = name;
		this.age = age;
		this.city = gender;
		this.gender = gender;

	}

	public static void main(String[] args) {
		Person Person = new Person();
		Person.describePerson();

		Person.name = "Dessy";
		Person.age = 20;
		Person.city = "Pune";
		Person.gender = "Female";
		Person.describePerson();

		Person John = new Person("John", 35, "Delhi", "Male");
		John.describePerson();

	}

	public void describePerson() {
		System.out.println("Person [name=" + name + ", age=" + age + ", city=" + city + ", gender=" + gender + "]");
	}

}
