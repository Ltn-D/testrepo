package Old_Javarush.Core.Level4_instanseof.Lecture8_2;

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getSparklingWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        return new Wine();

    }

    public static Wine getWine() {
        return new Wine();

    }

    public static Wine getSparklingWine() {
        return new SparklingWine();

    }
}
