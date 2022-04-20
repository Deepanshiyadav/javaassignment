package InheritanceInJava;

public class MinAnimal {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.eat();
		
		Dog d = new Dog();
		d.eat();
		d.bark();
		
		BabyDog bd = new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();
		
		Lion l = new Lion();
		l.eat();
		l.roar();
	}

}
