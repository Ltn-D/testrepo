package JAVA25.Level12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Lecture3_4 {
    static void main(String[] args) throws IOException {
        Path p1 = Path.of("letters.bin");
        Path p2 = Path.of("newsletters.bin");
        //byte[] tmp = Files.readAllBytes(p1);
        Files.write(p2, Files.readAllBytes(p1));



    }
}
