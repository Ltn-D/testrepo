package Old_Javarush.Syntax.Level17_Date;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Lecture8_2 {
    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter out = DateTimeFormatter.ofPattern("e dd.MM.yy HH:mm:ss.n \nVV");//напишите тут ваш код
        System.out.println(out.format(zonedDateTime));
        ZonedDateTime time = ZonedDateTime.parse("5 03.10.25 10:36:02.856288100 \n" +
                "Europe/Moscow",out);
        System.out.println(time);
    }
}
