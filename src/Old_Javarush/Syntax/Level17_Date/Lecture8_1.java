package Old_Javarush.Syntax.Level17_Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lecture8_1 {
    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter out = DateTimeFormatter.ofPattern("dd.MM.yyyyг. hhч.mm.мин");
        String txt = out.format(localDateTime);
        System.out.println(txt);//напишите тут ваш код
    }
}
