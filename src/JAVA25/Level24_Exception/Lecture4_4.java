package JAVA25.Level24_Exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Lecture4_4 {
    public static void main(String[] args) {
        System.out.println("Фоновая служба логирования запущена.");

        try {
            Path logFile = Files.createTempDirectory("334455");
            // Создаём временную директорию и намеренно используем её как путь к "файлу" лога.
            // Симулируем запись важного события в лог-файл
            saveEvent("test event",logFile);
            // До этой строки выполнение не дойдёт из-за выброшенного выше исключения
            System.out.println("Запись выполнена");

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
            e.printStackTrace();// Блок catch не пустой — здесь печатается полный стек вызовов.

        }

        System.out.println("Демонстрация завершена.");
    }

    // Бизнес-уровень: сохранение события делегирует фактическую запись.
    private static void saveEvent(String message, Path logFile) throws IOException {
        writeLog(logFile, message);
    }

    // Низкоуровневый метод: попытка записи в указанный путь.
    private static void writeLog(Path logFile, String text) throws IOException {
        // Пытаемся записать строку. В нашей демонстрации logFile указывает на директорию - будет исключение
        Files.writeString(logFile, text + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

}
