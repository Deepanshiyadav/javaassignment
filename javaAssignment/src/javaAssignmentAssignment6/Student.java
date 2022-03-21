package Kaizen.ConstructorsinJava;

public class Student {
	String s_name ;
	int s_age;
	int s_class;
	int s_id;
	String s_address;
	
	public Student() {
		
	}
	
	public Student(String s_name ,int s_age, int s_class, int s_id, String s_address) {
		this.s_name =  s_name;
		this.s_age = s_age;
		this.s_class = s_class;
		this.s_id = s_id;
		this.s_address = s_address;
		
	}
	
	public void show() {
		System.out.println( "Student [s_name=" + s_name + ", s_age=" + s_age + ", s_class=" + s_class + ", s_id=" + s_id+ ", s_address=" + s_address + "]");
	}
	public static void main(String[] args) {
		Student std = new Student();
		std.show();
		
		Student std1 =  new Student("Radha", 15, 8, 1556, "Vijay_nagar");
		std1.show();
		
		Student std2 =  new Student("Aayushi", 11, 4, 1111, "Nehru_nagar");
		std2.show();
		
		Student std3 =  new Student("Prabh", 16, 10, 1022, "Gandhi_nagar");
		std3.show();
		
	}

	

}
