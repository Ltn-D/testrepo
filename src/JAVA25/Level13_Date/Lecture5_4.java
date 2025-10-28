package JAVA25.Level13_Date;

import java.time.LocalDate;
import java.time.Period;

public class Lecture5_4 {
    static void main(String[] args) {
        LocalDate constructionDate = LocalDate.of(2000, 3, 20);
        LocalDate today = LocalDate.now();
        Period buildingAgePeriod = Period.between(constructionDate, today);
        System.out.println("Возраст: " + buildingAgePeriod.getYears() + " лет, " + buildingAgePeriod.getMonths() + " месяцев, " + buildingAgePeriod.getDays() + " дней");
    }
}
