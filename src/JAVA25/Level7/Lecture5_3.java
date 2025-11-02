package JAVA25.Level7;

import java.util.Arrays;

public class Lecture5_3 {
    public static void main(String[] args) {
        // Исходный массив температур за день
        int[] dailyTemperatures = {10, 20, 30, 40, 50, 60, 70};
        // Копируем элементы с индексами 2 (включительно) до 5 (не включая 5): 30, 40, 50
        int[] midleDailyTemperatures = Arrays.copyOfRange(dailyTemperatures, 2, 5);
        // Выводим полученный подмассив в формате [30, 40, 50]
        System.out.println(Arrays.toString(midleDailyTemperatures));
    }
}
