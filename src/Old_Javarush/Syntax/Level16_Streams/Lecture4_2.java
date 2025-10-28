package Old_Javarush.Syntax.Level16_Streams;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Lecture4_2 {
    static void main(String[] args) {
        char[] chars = args[0].toCharArray();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream);
             BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(scanner.nextLine())))
        {
            bufferedWriter.write(chars);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
