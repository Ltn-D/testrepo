package Old_Javarush.Syntax.Level16_Streams;

import java.io.InputStream;
import java.nio.file.Path;
import java.util.Scanner;

public class Lecture5_1 {
    static void main(String[] args) {
        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);
        String str = scanner.nextLine();
        Path path = Path.of(str);
        System.out.println(path.getRoot());
        System.out.println(path.getFileSystem());
    }
}
