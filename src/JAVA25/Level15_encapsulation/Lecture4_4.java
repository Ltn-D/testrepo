package JAVA25.Level15_encapsulation;

public class Lecture4_4 {
    static void main(String[] args) {
        System.out.println(GlobalConstants.CALENDAR_DAYS_IN_YEAR);
        System.out.println((GlobalConstants.MATH_PI));
    }
}

class GlobalConstants {
    public static final double MATH_PI = 3.14159;
    public static final int CALENDAR_DAYS_IN_YEAR = 365;
}
