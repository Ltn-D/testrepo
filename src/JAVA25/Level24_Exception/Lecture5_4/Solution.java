package JAVA25.Level24_Exception.Lecture5_4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("ancient_manuscript.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("digital_archive.txt"))) {
            String line;
            while ((line = reader.readLine())!= null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка копирования рукописи!");
        }

        // try-with-resources: одновременно открываем "читателя" и "писателя".



        // Читаем исходный файл построчно и сразу записываем каждую строку в целевой



        // Если произошла ошибка при чтении/записи — выводим требуемое сообщение

    }

}
