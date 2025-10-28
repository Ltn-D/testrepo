package JAVA25.Level12.Lecture3_1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Lecture3_2 {
    static void main(String[] args) throws IOException{
        Path path = Path.of("note.txt");
        String text =  Files.readString(path);
        System.out.println(text);
        Path p = Path.of("note1.txt");
        String text1 = "Где же файл?";
        Files.writeString(p, text1);
        System.out.println(Files.readString(path));
        System.out.println(Files.readString(p));


    }




}
