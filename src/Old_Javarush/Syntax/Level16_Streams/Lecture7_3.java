package Old_Javarush.Syntax.Level16_Streams;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Lecture7_3 {


    public static void main(String[] args)throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();// создаем соединение используюя класс URLConnection
        connection.setDoOutput(true);// сообщаем что соединение  используется для отправки на сервер
        try (OutputStream output = connection.getOutputStream();){
            output.write(1);//отправляем байт
        }
        try  (InputStream input = connection.getInputStream()){
            byte[] bytes = input.readAllBytes();//получаем байт
            String data = new String(bytes);
            System.out.println(data);

        }
    }
}
