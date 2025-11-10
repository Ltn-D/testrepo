package JAVA25.Level9_String;

public class Lecture5_3 {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("abcdef");

        // Создаем StringBuilder с исходной строкой
        string.reverse();

        // Разворачиваем строку с помощью стандартного метода reverse()


        // Выводим результат на экран: должно получиться "fedcba"
        System.out.println(string);

    }
}
