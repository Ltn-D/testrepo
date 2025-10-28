package JAVA25.Level12;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class Lecture4_1 {
    static void main(String[] args) throws IOException {
        String imageURL = "https://httpbin.org/image/png";
        String filename = "image01.png";


        URL url = new URL(imageURL);// создаем URL
        Files.copy(url.openStream(), Path.of(filename));//вызываем для URL метод openStream() и копируем его в файл

        /* второй способ,
        InputStream in = new URL(imageURL).openStream(); - создаем поток с помощью openStream()
        in.transferTo(Files.newOutputStream(Path.of(filename))); с помощью метода transferTo перекачиваем в новый поток который записывает файл
        */


    }
}
