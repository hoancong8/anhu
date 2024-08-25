import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        CalculateTime a = new CalculateTime();
//        System.out.println("Hello world!" +a.getNow() + "\t" + a.getStartTime() + "\n" + a.getTime());
//        float s = (float)a.getTime()/1000;
//        float minute = (float) s/60;
//        float fhour = (float) minute/60;
//        int ihour = (int) fhour;
//        float surplus = fhour - ihour;
//        int iminuteOfHour = (int)(surplus * 60);
//        float fminuteOfHour = ((surplus * 60)-iminuteOfHour)*60;
//
//        System.out.println(("hour : " + fhour +"\n"+ihour +":"  +fminuteOfHour));
//        Calendar calendar = Calendar.getInstance();
//        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
//        int dayofmonth = calendar.get(Calendar.DAY_OF_MONTH);
//        int month = calendar.get(Calendar.MONTH);
//        int year = calendar.get(Calendar.YEAR);
//        System.out.println(dayOfWeek
//                +"\n"+dayofmonth
//                +"\n"+month
//                +"\n"+year
//                );

        LocalDate selectedDate;
        selectedDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
        int f = selectedDate.getDayOfMonth();
        System.out.println(selectedDate.getDayOfMonth());
    }

}