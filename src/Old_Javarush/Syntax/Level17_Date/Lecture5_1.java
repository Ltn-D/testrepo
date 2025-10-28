package Old_Javarush.Syntax.Level17_Date;

import java.time.LocalTime;

public class Lecture5_1 {
    static LocalTime timeMax = LocalTime.MAX;
    static LocalTime timeMin = LocalTime.MIN;
    static LocalTime time1 = LocalTime.of(14, 00);
    static LocalTime time2 = LocalTime.of(7, 0,8);
    static LocalTime time3 = LocalTime.of(0, 45, 0, 61);
    static LocalTime time4 = LocalTime.of(14,0,45,1001);

    public static void main(String[] args) {
        LocalTime newTime = LocalTime.of(time1.getHour(), time2.getMinute(), time3.getSecond(), time4.getNano());//напишите тут ваш код
        System.out.println(newTime);
        System.out.println(timeMax);
        System.out.println(timeMin);
        System.out.println(LocalTime.MIDNIGHT);
    }
}
