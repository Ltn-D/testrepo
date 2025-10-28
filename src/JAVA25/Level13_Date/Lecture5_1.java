package JAVA25.Level13_Date;

import java.time.LocalDate;

public class Lecture5_1 {
    static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate holidayCountdownStart = today.plusDays(10);
        System.out.println(holidayCountdownStart);

    }
}
