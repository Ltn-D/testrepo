package Old_Javarush.Syntax.Enum;

public class metods {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.MONDAY;
        System.out.println(day);
        System.out.println(day.name()); // возвращает имя константы, не понятно чем отличается от просто обращения к переменной.
        System.out.println(day.ordinal());// возвращает номер (с 0)
        DayOfWeek today = DayOfWeek.valueOf("MONDAY");// преобразует строку в константу emun если такая константа есть в enum, иначе исключение IllegalArgumentException
        System.out.println(today);
        DayOfWeek[] days = DayOfWeek.values(); //получаем массив значений enum
    }
}
