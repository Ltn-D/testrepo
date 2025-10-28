package JAVA25.Level12;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class Lecture4_2 {
    static void main(String[] args) throws IOException {
        Path file = Path.of("image2.jpeg"); // создаем путь для файла куда будем сохранять данные
        URL url = new URL("https://httpbin.org/image/png)"); // создаем URL для адреса подключения

        try {

            InputStream in = url.openStream(); // методом openSteam класса URL открываем InputStream (соединение для получения данных), имя - in

            OutputStream out = Files.newOutputStream(file); //методом newOutputStream класса Files создаем поток для записи(передачи данных) в файл имя out

            in.transferTo(out); // с помощью метода transferTo передаем in в out
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        }
    }

