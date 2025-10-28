package JAVA25.Level24_Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lecture4_2 {
    public static void main(String[] args) {
        // try-with-resources автоматически закроет файл после работы
        try (BufferedReader reader = new BufferedReader(new FileReader("game_config.txt"))) {
            // Читаем первую строку настроек
            String inputdata = reader.readLine();
            // Если строка отсутствует, считаем это ошибкой формата
            if (inputdata == null) {
                throw new NumberFormatException("Пустой файл");
            }
            // Преобразуем строку в число (может выбросить NumberFormatException)
            int config = Integer.parseInt(inputdata);
            // Для наглядности покажем загруженное значение
            System.out.println(config);
        // Один "умный" catch обрабатывает сразу два типа проблем:
        } catch (NumberFormatException | IOException exception) {
            System.out.println("Ошибка: " + exception.getMessage());
        }
    }
}
