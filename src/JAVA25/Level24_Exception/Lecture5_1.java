package JAVA25.Level24_Exception;

import Old_Javarush.Core.Level5_overload.Lecture8_11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lecture5_1 {
    public static void main(String[] args) {
        // Используем try-with-resources, чтобы поток автоматически закрылся
        try (BufferedReader reader = new BufferedReader(new FileReader("article_text.txt"))) {
            String message = reader.readLine();
            System.out.println(message);
        } catch (IOException e) {
            System.out.println("Ошибка чтения статьи!");
        }
    }
}
