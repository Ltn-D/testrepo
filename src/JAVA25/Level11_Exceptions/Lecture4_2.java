package JAVA25.Level11_Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lecture4_2 {
    public static void analyzeSystemLog(String logFileName) throws IOException {
        // Попытка создать BufferedReader для чтения файла
        BufferedReader reader = new BufferedReader(new FileReader(logFileName));
        reader.close();
        // Закрытие ресурса (try-with-resources не используется, так как метод только пробрасывает исключение)

    }
    static void main(String[] args) {
        try {
            analyzeSystemLog("non_existent_log.txt");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при попытке прочитать файл системных логов. Ошибка чтения файла.");
        }


    }
}
