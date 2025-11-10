package JAVA25.Level11_Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lecture4_3 {
    public static void extractFirstLineFromData(String dataFile) throws FileNotFoundException, IOException {
        // Создаем FileReader для чтения файла
        FileReader reader = new FileReader(dataFile);
        // Оборачиваем FileReader в BufferedReader для построчного чтения
        BufferedReader reader1 = new BufferedReader(reader);
        // Читаем первую строку из файла
        String data = reader1.readLine();
        reader1.close();


        // Закрываем BufferedReader (он автоматически закроет и FileReader)


        // Выводим первую строку на экран (опционально, если требуется)
        System.out.println(data);

    }

    public static void main(String[] args) throws IOException {
        String dataFile = "123.txt";
        extractFirstLineFromData(dataFile);

    }
}
