package IOFormatting;
import java.util.Date;
public class Ques3 {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %1$tA, %1$tB %1$tY %n", date);
        System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %1$tA, %1$tB %1$td %1$tY %n", date);
        System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);
    }
}

