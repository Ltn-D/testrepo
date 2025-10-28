package Old_Javarush.Syntax.Level17_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Lecture1_1 {
    static void main(String[] args) {
        Date current = new Date();
        System.out.println(current);
        Date birthday = new Date(112, 6, 25);
        System.out.println(birthday);
        Date jobStop = new Date(125, 9, 1, 17, 0, 0);
        System.out.println(jobStop);
        String strDate = "Sat, April 4, 2020";
        SimpleDateFormat format = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        try {
            Date date = format.parse(strDate);
            System.out.println(date);
            System.out.println(format.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }







    }
}
