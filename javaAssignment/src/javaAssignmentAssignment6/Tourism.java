package Kaizen.ConstructorsinJava;

public class Tourism {
	String City;
	String Mode;
	String Hotel;
	String food;

	public Tourism() {

	}

	public Tourism(String City, String Mode, String Hotel, String food) {
		this.City = City;
		this.Mode = Mode;
		this.Hotel = Hotel;
		this.food = food;
	}

	public void show() {
		System.out.println("Tourism [City=" + City + ", Mode=" + Mode + ", Hotel=" + Hotel + ", food=" + food + "]");
	}

	public static void main(String[] args) {
		Tourism tour = new Tourism();
		tour.show();

		Tourism Tour1 = new Tourism("Indore", "car", "Blue_Star", " Dal_Bati");
		Tour1.show();

		Tourism Tour2 = new Tourism("Ujjain", "Car", "Marriot", " Kulfi");
		Tour2.show();

		Tourism Tour3 = new Tourism("Bhopal", "Train", "pink_sky", " Kachori");
		Tour3.show();

		Tourism Tour4 = new Tourism("Gwalior", "Bus", "Radisson", " Poha_jalebi");
		Tour4.show();

	}

}
