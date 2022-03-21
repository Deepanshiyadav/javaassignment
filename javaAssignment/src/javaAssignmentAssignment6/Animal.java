package Kaizen.ConstructorsinJava;

public class Animal {
	String name;
	String bread;
	String color;
	int age;

	
	
	public Animal() {
		
	}
	
	public Animal(String name, String bread, String color, int age) {
		this.name= name;
		this.bread= bread;
		this.color=color;
		this.age=age;
	}
	
	public void display() {
		System.out.println("Animal [name=" + name + ", bread=" + bread + ", color=" + color + ", age=" + age + "]");
	}

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.display();
		
		Animal Dog = new Animal("Tommy", "German_shaford", "Black", 4);
		Dog.display();
		
		Animal Cat = new Animal("kitty", "Persian", "White", 6);
		Cat.display();
		
		Animal Cow = new Animal("Rani", "Brown swis", "Brown", 16 );
		Cow.display();
		
	}
	
}
