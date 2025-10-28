package JAVA25.Level13_Date;

import java.time.LocalDate;

public class Lecture1_3 {
    static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        System.out.println(tomorrow);
    }
}
