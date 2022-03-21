package Kaizen.ConstructorsinJava;

public class Person {
	String name;
	String addess;
	int age;
	String gender;
	String occupation;

	public Person() {
		System.out.println();
	}

	public Person(String name, String address, int age, String gender, String occupation) {
		this.name = name;
		this.addess = address;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
	}

	public  void display() {
		System.out.println("Person [name=" + name + ", addess=" + addess + ", age=" + age + ", gender=" + gender + ", occupation=" + occupation+"]");

			}

	public static void main(String[] args) {
		Person Person = new Person();
		Person.display();

		Person person1 = new Person("william", "Delhi", 29, "Male", "Employee");
		person1.display();
		
		Person person2 = new Person("Javed", "west bengal", 27, "male","driver");
		person2.display();
		
		Person person3 = new Person("savita", "karnatak", 32, "female", "teacher");
		person3.display();
		
		Person person4 = new Person("komal", "pune",28, "female", "advocate");
		person4.display();

	}

}
