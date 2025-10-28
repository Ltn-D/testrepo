package Old_Javarush.Syntax.Enum;

import java.util.Scanner;

public class newSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DayOfWeek today = DayOfWeek.valueOf(scanner.nextLine().toUpperCase());
        String mood = switch (today) {

            case MONDAY -> "Тяжело вставать";
            case TUESDAY, WEDNESDAY, THURSDAY -> "Работа";
            case FRIDAY -> {
                System.out.println("Ура!!!");
                yield "Скоро выходные";
            }
            case SATURDAY, SUNDAY -> {
                System.out.println("УРА!!!!");
                yield "ВЫХОДНЫЕ!!!";
            }
        };
        System.out.println(mood);

    }
}
