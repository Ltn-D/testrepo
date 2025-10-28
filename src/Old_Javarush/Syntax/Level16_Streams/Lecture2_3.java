package Old_Javarush.Syntax.Level16_Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Lecture2_3 {
    static void main(String[] args) {
        try (Scanner scanner = new Scanner((System.in))) {
            List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));// метод readAllLines AutoCloseable поэтому не оборачивается в try
            for (String string : lines) {
                char[] chars = string.toCharArray();
                for (char simbol : chars) {
                    if (simbol != ',' && simbol != '.' && simbol != ' ') {
                        System.out.print(simbol);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
