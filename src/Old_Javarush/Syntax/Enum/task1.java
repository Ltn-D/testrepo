package Old_Javarush.Syntax.Enum;

import java.util.Scanner;
import java.util.Arrays;

public class task1 {
    /* создаем перечисление закомментировано т.к. потом создано публичное перечисление в отдельном файле DayOfWeek.java
    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    */

    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.THURSDAY; // присваиваем переменной значение из перечисления и выводим его.
        System.out.println(dayOfWeek);
        dayOfWeek = DayOfWeek.MONDAY;
        System.out.println(dayOfWeek);

        System.out.println(DayOfWeek.values()); // возвращает ссылку, для перечисления значений нужен цикл
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
        // или так
        DayOfWeek[] days = DayOfWeek.values();// получаем массив констант
        System.out.println(Arrays.toString(days));

        //пример использования в switch
        //DayOfWeek today = DayOfWeek.WEDNESDAY;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели:");
        String day = scanner.nextLine().toUpperCase();// считываем и приводим к заглавным буквам
        DayOfWeek today = DayOfWeek.valueOf(day); // создаем переменную из перечисления и присваиваем ей введенное значение
        //значение должно совпадать с одним из значений перечисления (enum)

        switch (today) {
            case MONDAY:
                System.out.println("Понедельник");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Обычный день");
                break;
            case FRIDAY:
                System.out.println("Ура!! Пятница");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("Супер ВЫХОДНОЙ!!!");
                break;
        }
    }
}
