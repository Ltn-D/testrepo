package JAVA25.Level13_Date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Lecture5_3 {
    static void main(String[] args) {
        LocalDate projectDeadline = LocalDate.of(2025, 5, 15);
        LocalDate today = LocalDate.now();
        long daysRemaining = ChronoUnit.DAYS.between(today, projectDeadline);
        System.out.println(daysRemaining);
    }



}
