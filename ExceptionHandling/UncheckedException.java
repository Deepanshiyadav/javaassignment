package ExceptionHandling;

public class UncheckedException {

    public static void main(String[] args){
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
            System.out.println("Hello");
        }catch (ArithmeticException e){
            System.out.println("invalid denominator");
        }
        finally{
            System.out.println("The code is done");
        }
    }
}
