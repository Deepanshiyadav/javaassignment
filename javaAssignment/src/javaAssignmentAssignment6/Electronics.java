package Kaizen.ConstructorsinJava;

public class Electronics {
	String e_name;
	String e_company;
	String e_model;
	String e_color;
	int price;
	
	public Electronics() {
		
	}
	public Electronics(String e_name, String e_company, String e_model, String e_color, int price) {
		this.e_name=e_name;
		this.e_company= e_company;
		this.e_model = e_model;
		this.e_color= e_color;
		this.price =  price;
	}
	
	public  void display() {
		System.out.println("Electronics [e_name=" + e_name + ", e_company=" + e_company + ", e_model=" + e_model + ", e_color="+ e_color + ", price=" + price + "]");
	}
	public static void main(String[] args) {
		Electronics obj = new Electronics();
		obj.display();
		
		Electronics item = new Electronics("Fan", "Bajaj", "iu2022", "Black", 20000);
		item.display();
		
		Electronics item2 = new Electronics("Television", "Panasonic", "LED30", "metalic greay", 50000);
		item2.display();

		
	}
	
}
