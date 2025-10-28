package Old_Javarush.Syntax.Level16_Streams;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Lecture4_1 {
    static void main(String[] args) throws IOException {
        byte[] bytes = args[0].getBytes();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream))
              {
            Files.write(Path.of(scanner.nextLine()), bytes);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
