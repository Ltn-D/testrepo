package Old_Javarush.Syntax.Level16_Streams;

import java.nio.file.Path;
import java.util.Scanner;

public class Lecture5_2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        Path path1 = Path.of(str1);
        Path path2 = Path.of(str2);
        System.out.println(path2.relativize(path1));
    }
}
