package InheritanceinJava;

public class Question_21 {

    class A{
        public A (int a){}
    }

    class B extends A{
   public B(){}
//   Error:(10, 19) java: constructor A in class InheritanceinJava.Question_21.A cannot be applied to given types;
//   required: int
//   found: no arguments
//   reason: actual and formal argument lists differ in length
  }

    public static void main(String[] args) {
        B b= new B();
//      Error:(14, 14) java: non-static variable this cannot be referenced from a static context
    }
}
