package Old_Javarush.Syntax.Level17_Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lecture8_3 {
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("H:m:s d/MM/yyyy");
    static String timeString = "13:30:45 23/02/2019";

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.parse(timeString,dateTimeFormatter);

        System.out.println(dateTime);
    }
}
