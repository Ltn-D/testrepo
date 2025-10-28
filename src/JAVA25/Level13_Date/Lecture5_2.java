package JAVA25.Level13_Date;

import java.time.LocalDate;

public class Lecture5_2 {
    static void main(String[] args) {
        LocalDate futureMilestone = LocalDate.of(2025, 01, 01);
        LocalDate today = LocalDate.now();
        if (futureMilestone.isBefore(today)) {
            System.out.println("2025 уже наступил");
        } else {
            System.out.println("2025 еще не наступил");
        }
    }
}
