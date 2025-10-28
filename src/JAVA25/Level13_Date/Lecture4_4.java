package JAVA25.Level13_Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lecture4_4 {
    static void main(String[] args) {
        String orderTimestampString = "01.06.2025 14:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        LocalDateTime parsedOrderDateTime = LocalDateTime.parse(orderTimestampString, formatter);
        System.out.println(parsedOrderDateTime);
    }
}
