package JAVA25.Level13_Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Lecture4_3 {
    static void main(String[] args) {
        LocalDate specificEventDate = LocalDate.of(2023, 3, 15);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String friendlyDisplayDateString = specificEventDate.format(formatter);
        System.out.println(friendlyDisplayDateString);
    }
}
