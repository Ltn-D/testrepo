package Old_Javarush.Syntax.Level17_Date;

import java.util.Date;

public class Lecture2_1 {
    static Date birthDate = new Date(78,7,29);

    static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
        //System.out.println(birthDate.getDay());
    }


    static String getDayOfWeek(Date date) {
        String dayOfWeek;
        switch (date.getDay()) {

            case 1 -> {
                dayOfWeek = "Понедельник";
            }
            case 2 -> {
                dayOfWeek = "Вторник";
            }
            case 3 -> {
                dayOfWeek = "Среда";
            }
            case 4 -> {
                dayOfWeek = "Четверг";
            }
            case 5 -> {
                dayOfWeek = "Пятница";
            }
            case 6 -> {
                dayOfWeek = "Суббота";
            }
            case 0 -> {
                dayOfWeek = "Воскресенье";
            }
            default ->  dayOfWeek = "";
        }
        return dayOfWeek;
    }
}

