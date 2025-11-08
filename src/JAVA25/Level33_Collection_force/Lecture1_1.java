package JAVA25.Level33_Collection_force;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Lecture1_1 {
    public static void main(String[] args) {
        // Массив сумм отдельных продаж за день
        int[] dailySalesFigures = {10, 20, 30, 40, 50};

        // Примитивный стрим IntStream (без boxing) + терминальная операция sum()
        int total = Arrays.stream(dailySalesFigures).sum();


        // Выводим итоговую сумму выручки
        System.out.println(total);
    }

}
