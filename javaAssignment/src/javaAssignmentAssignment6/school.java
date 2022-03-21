package Kaizen.ConstructorsinJava;

public class school {
	String school_name;
	int student_population;
	int  teacher_population;
	String streams;

	
	public school() {
		System.out.println();
	}
	
	public school(String school_name, int student_population, int  teacher_population, String streams) {
		this.school_name = school_name;
		this.student_population = student_population;
		this.teacher_population = teacher_population;
		this.streams = streams;
	}
	
	public void show() {
		System.out.println(	"school [school_name=" + school_name + ", student_population=" + student_population+ ", teacher_population=" + teacher_population + ", streams=" + streams + "]");
	}
	
	public static void main(String[] args) {
		school sc = new school();
		sc.show();
		
		school sc1 = new school ("Primary school", 200, 70, "Nursery");
		sc1.show();
		
		school sc2 = new school("secondary school", 300, 50, "PCM");
		sc2.show();
	}
}

