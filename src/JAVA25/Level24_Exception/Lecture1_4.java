package JAVA25.Level24_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lecture1_4 {
    public static void main(String[] args) {
        try {
            // Имитация поиска отчёта: намеренно бросаем исключение
            throw new FileNotFoundException("Отчёт не найден!");

        } catch (FileNotFoundException e) {
            // Самый специфичный план: файл отсутствует
            System.out.println("Отчёт не найден");

        } catch (IOException e) {
            // Более общий план: проблемы ввода-вывода
            System.out.println("Общие проблемы с доступом к данным");

        } catch (Exception e) {
            // Самый общий план: любая другая непредвиденная ситуация
            System.out.println("Непредвиденная ситуация");

        }
    }
}
