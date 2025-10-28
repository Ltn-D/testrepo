package Old_Javarush.Syntax.Level16_Streams;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class Lecture7_2 {
    static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        InputStream input = url.openStream();// открываем входящий поток с URL
        byte[] bytes = input.readAllBytes();// направляем входящий поток в массив байт
        String str = new String(bytes); //пребразовываем массив в строку для вывода

        String string = new String(url.openStream().readAllBytes());//можно все в одной строке

        System.out.println(str);

    }
}
