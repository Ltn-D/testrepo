package Old_Javarush.Syntax.Level16_Streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Lecture2_1_real {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path path = Path.of(scanner.nextLine());
        //напишите тут ваш код
        List<String> strings = Files.readAllLines(path);
        for (int i = 0; i < strings.size(); i += 2) {
            System.out.println(strings.get(i));
        }
    }
}
