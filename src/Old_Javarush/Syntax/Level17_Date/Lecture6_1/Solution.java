package Old_Javarush.Syntax.Level17_Date.Lecture6_1;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/*
Синтезируем LocalDateTime
*/

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        Set<LocalDateTime> dataTime = new HashSet();//напишите тут ваш код
        for (LocalDate date : sourceMap.keySet()) {
            List<LocalTime> times = sourceMap.get(date);
            for (LocalTime time : times) {
                dataTime.add(LocalDateTime.of(date, time));
            }
        }
        return dataTime;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}