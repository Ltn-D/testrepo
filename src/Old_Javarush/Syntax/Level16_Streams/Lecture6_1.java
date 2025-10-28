package Old_Javarush.Syntax.Level16_Streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Lecture6_1 {
    public static final String THIS_IS_FILE = " - это файл";
    public static final String THIS_IS_DIR = " - это директория";

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Path path = Path.of(scanner.nextLine());
            if (Files.isRegularFile(path)) {
                System.out.println(path + THIS_IS_FILE);
            } else if (Files.isDirectory(path)) {
                System.out.println(path + THIS_IS_DIR);
            } else {
                break;
            }
        }
    }
}
