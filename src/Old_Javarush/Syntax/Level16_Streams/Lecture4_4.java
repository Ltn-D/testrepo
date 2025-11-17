package Old_Javarush.Syntax.Level16_Streams;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Lecture4_4 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());

        try (DirectoryStream<Path> sourceDirectoryFiles = Files.newDirectoryStream(sourceDirectory)){
            for (Path path : sourceDirectoryFiles) {
                if (Files.isRegularFile(path)) {
                    Files.move(path, targetDirectory.resolve(path.getFileName()));
                }
            }
        }
    }
}
