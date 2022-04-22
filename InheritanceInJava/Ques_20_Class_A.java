package InheritanceinJava;

public class Ques_20_Class_A {
    int x = 50;
    private Ques_20_Class_A(){
        System.out.println(x);
    }
}
public class B extends Ques_20_Class_A{ //Error:(9, 8) java: class B is public, should be declared in a file named B.java

    public static void main(String[]args){
        B b = new B();
        }
        }