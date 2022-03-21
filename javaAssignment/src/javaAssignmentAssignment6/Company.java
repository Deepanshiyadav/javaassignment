package Kaizen.ConstructorsinJava;

public class Company {
	String name;
	String working;
	String location;
	int population;
	
	public Company() {
		System.out.println("XYZ");
	}
	
	public Company(String name, String working, String location, int population) {
		this.name=name;
		this.working= working;
		this.location= location;
		this.population= population;
	}
	
	public void display() {
		System.out.println("Company [name=" + name + ", working=" + working + ", location=" + location + ", population="+ population + "]");
	}
	
	public static void main(String[] args) {
		Company company = new Company();
		company.display();
		
		Company company1 = new Company("XYZ", "IT company", "Delhi", 30);
		company1.display();
		
		Company company2 = new Company("ABC", " Manufacture company", "Pune", 100);
		company2.display();

	}

}
