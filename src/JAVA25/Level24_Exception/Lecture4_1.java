package JAVA25.Level24_Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lecture4_1 {
    public static void main(String[] args) {
        // try-with-resources автоматически закроет файл даже при ошибках
        try (BufferedReader reader = new BufferedReader(new FileReader("daily_transactions.txt"))) {
            // Читаем первую строку из файла
            String data = reader.readLine();
            // Пустой файл или отсутствие первой строки считаем некорректными данными
            if (data == null) {
                throw new NumberFormatException("Пустой файл");
            }
            // Пытаемся преобразовать строку в целое число
            int summ = Integer.parseInt(data);
            // Успешный сценарий: по условию ничего не выводим
            System.out.println(summ);

            // Отдельный план для ситуации, когда файла нет
        } catch (FileNotFoundException e) {
            System.out.println("Файл транзакций не найден!");
            // Отдельный план для некорректных данных в первой строке
        } catch (NumberFormatException e) {
            System.out.println("В файле обнаружены некорректные финансовые данные!");
            // Любые другие проблемы ввода-вывода при чтении файла
        } catch (IOException e) {
            System.out.println("Ошибка чтения данных из файла!");
        }
    }
}
