package Kaizen.ConstructorsinJava;

public class Medical {
	String Medicine;
	int price;
	int quantity;

	public Medical() {

	}

	public Medical(String Medicine, int price, int quantity) {
		this.Medicine = Medicine;
		this.price = price;
		this.quantity = quantity;
	}

	public void display() {
		System.out.println("Medical [Medicine=" + Medicine + ", price=" + price + ", quantity=" + quantity + "]");
	}

	public static void main(String[] args) {
		Medical medical = new Medical();
		medical.display();

		Medical medicine1 = new Medical("Paracetamol", 20, 5);
		medicine1.display();

		Medical medicine2 = new Medical("Combieflame", 30, 6);
		medicine2.display();

		Medical medicine3 = new Medical("Vicks_Ation_500", 50, 25);
		medicine3.display();

	}

}
