package JAVA25.Level9_String;

public class Lecture4_3 {
    public static void main(String[] args) {
        // Объявляем две строковые переменные с начальными значениями
        String first = "apple";
        String second = "banana";

        // Сравниваем строки лексикографически:
        System.out.println(first.compareTo(second));
        String tmp = first;
        first = second;
        second = tmp;
        System.out.println(first.compareTo(second));



        // Меняем значения переменных местами


        // Повторяем сравнение после обмена

    }
}