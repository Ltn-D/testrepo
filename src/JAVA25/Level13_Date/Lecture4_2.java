package JAVA25.Level13_Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Lecture4_2 {
    static void main(String[] args) {
        String inputDateString = "2024-12-31";
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        try {
            LocalDate parsedLocalDate = LocalDate.parse(inputDateString, formatter);
            System.out.println(parsedLocalDate);;
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
    }
}
