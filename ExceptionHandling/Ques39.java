package ExceptionHandling;

public class Ques39 {
    public static void main(String[] args) {
        try {
            int [] list = new int[10];
            System.out.println("list : " +list[10]);//Array_Index_out_of_bound exception.
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Array Index Out of Bound");
        }
        catch (RuntimeException r){
            System.out.println("Runtime Exception");
        }
    }
}