package JAVA25.Level24_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Lecture4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        // Пытаемся открыть файл — здесь может возникнуть FileNotFoundException
        try (FileInputStream stream = new FileInputStream(fileName)) {
            int inputData = stream.read();
            if (inputData < 0) {
                throw new IOException("Пустой файл");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Секретный документ не найден!");
        } catch (IOException e) {
            System.out.println("Ошибка доступа к архиву!");
        }
    }
}
