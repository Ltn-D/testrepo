package Old_Javarush.Syntax.Level16_Streams;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.util.Scanner;

public class Lecture7_1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        //напишите тут ваш код
        URL url = new URL(line);
        InputStream input = url.openStream();
        byte[] bytes = input.readAllBytes();
        Files.write(Files.createTempFile(null,null),bytes);



    }


}
