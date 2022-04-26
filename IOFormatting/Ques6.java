package IOFormatting;
import java.util.Date;
public class Ques6 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("The total hours from mid-night today is  " + date.getHours() + " and minutes is  "+date.getMinutes());
    }

}
