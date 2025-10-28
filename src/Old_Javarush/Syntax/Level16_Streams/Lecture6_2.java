package Old_Javarush.Syntax.Level16_Streams;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Lecture6_2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        if (Files.exists(filePath) && Files.notExists(fileNewPath)) {
            Files.move(filePath, fileNewPath);
        } else if (Files.exists(filePath) && Files.exists(fileNewPath)) {
            Files.delete(filePath);
        } else {
            Files.createFile(filePath);
        }
    }
}
