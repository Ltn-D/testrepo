package Old_Javarush.Syntax.Level16_Streams;

import java.nio.file.Path;
import java.util.Scanner;

public class Lecture5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path = Path.of(str);
        if (path.isAbsolute()) {
            System.out.println(path);
        }else System.out.println(path.toAbsolutePath());
    }
}
