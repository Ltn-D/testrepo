package JAVA25.Level29_Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lecture5_2 {
    public static void main(String[] args) {
        // Создаем список playerScores и заполняем его в указанном порядке
        List<Integer> playerScores = Arrays.asList(7, 2, 10, 4, 10, 1);

        // Используем Collections.max и Collections.min для поиска экстремумов
        int highestScore = Collections.max(playerScores);
        int lowestScore = Collections.min(playerScores);


        // Выводим максимум и минимум через пробел
        System.out.println(highestScore + " " + lowestScore);
    }
}
