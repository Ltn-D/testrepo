package Old_Javarush.Syntax.Collections2.Lecture6_3;


import java.util.Arrays;

public class Lecture6_4 {
    static void main(String[] args) {
        System.out.println(getNextMonth(Month.DECEMBER));
        System.out.println(Arrays.toString(Month.getSummerMonths()));


    }

    public static Month getNextMonth(Month month) {
        if (month.equals(Month.DECEMBER)) {
            return Month.JANUARY;
        } else {
            return Month.values()[month.ordinal() + 1];
        }
    }
}
