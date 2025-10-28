package JAVA25.Level12.Lecture3_1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\111\\IdeaProjects\\javarush_learning\\src\\JAVA25\\Level12\\Lecture3_1\\note.txt");
        Files.writeString(path, "Сегодня отличный день \nдля изучения Java");
    }
}
