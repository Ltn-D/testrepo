package JAVA25.Level28_Collections;

import java.util.EnumMap;

enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

public class Lecture4_2 {
    static void main(String[] args) {
        EnumMap<Day, Integer> dayPrices = new EnumMap<>(Day.class);
        dayPrices.put(Day.MON, 100);
        dayPrices.put(Day.TUE, 120);
        dayPrices.put(Day.SAT, 200);
        System.out.println(dayPrices.get(Day.SAT));
    }

}
