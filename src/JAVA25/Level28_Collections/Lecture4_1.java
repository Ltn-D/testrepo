package JAVA25.Level28_Collections;

import java.util.EnumSet;

public class Lecture4_1 {
    enum Day {
        MON, TUE, WED, THU, FRI, SAT, SUN
    }

    static void main(String[] args) {
        EnumSet<Day> weekend = EnumSet.of(Day.SAT, Day.SUN);
        System.out.println(weekend);
    }
}
