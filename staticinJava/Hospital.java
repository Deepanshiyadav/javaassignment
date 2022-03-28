package staticinJava;

public class Hospital {
	
	String name;
	static enum Status {registered,verified, certified};
	Status s = Status.registered;
	
	Hospital(String name){
		this.name = name;
	}
	
	public void show() {
		System.out.print("Name:  " + name + "    " );
		System.out.println(s);
	}
	
	
public static void main(String[] args) {
	Hospital obj = new Hospital("Aaradhya");
	obj.show();
	
	Hospital obj1 = new Hospital("Ranvee");
	obj1.show();
	
	
}
}
