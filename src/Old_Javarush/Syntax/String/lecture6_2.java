package Old_Javarush.Syntax.String;

public class lecture6_2 {
    public static void main(String[] args) {
        System.out.println(format("Денис", 5000));

    }

    public static String format(String name, int salary) {
        return String.format("Меня зовут %s. Я буду зарабатывать %d $ в месяц!", name, salary);
    }
}
