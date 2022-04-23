package DataTypes_Variables;

public class Question30{
      static int minsInHour = 60;
    public static void main(String[] a){
        System.out.println(minsInHour);

        minsInHour = 75;//it cannot be reinitialized because we declare it already as final , and final values cannot be reinitialize.
        System.out.println(minsInHour);

    }
}
