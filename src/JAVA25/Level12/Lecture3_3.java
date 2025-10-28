package JAVA25.Level12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.charset.Charset;
import java.nio.file.Path;

public class Lecture3_3 {
    static void main(String[] args) throws IOException {
        byte[] data = {72, 73, 74};
        Path path = Path.of("letters.bin");
        Files.write(path, data);
        byte[] letter = Files.readAllBytes(path);
        for (byte b : letter) {
            System.out.print                    ((char) b + " ");
        }
    }
}
