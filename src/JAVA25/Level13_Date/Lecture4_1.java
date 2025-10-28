package JAVA25.Level13_Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Lecture4_1 {
    static void main() {
        LocalDate currentReportDate = LocalDate.now();
        String formattedReportDate = currentReportDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(formattedReportDate);

    }
}
