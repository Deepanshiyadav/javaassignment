package InheritanceinJava;

public class Question8 {

    public  static class Employee{
        String name;
        int age;
        int salary;

        public Employee(){}
        public Employee(String name, int age){
            this.name=name;
            this.age=age;
        }

    }

    public  static class Manager extends Employee{
        int bonus;
        public Manager(){}
        public Manager( int salary,int bonus ){
            this.bonus=bonus;
            this.salary=salary;
        }
        public int getSalary(){
            return (int)(salary+bonus);
        }
    }
    public static class Secratory extends Manager{

        public Secratory(){
            super(14500, 1200);
        }

        public int getSalary() {
            int i = salary+bonus;
            return (i);
        }
    }


    public static void main(String[] args) {
        Secratory s = new Secratory();
        int a=s.getSalary();
        System.out.println("Total is :"+ a);
    }

}
