package JAVA25.Level12;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Lecture4_3 {
    static void main(String[] args) throws IOException, InterruptedException {
        Path file = Path.of("image3.webp");
        String url = "https://httpbin.org/image/webp"; // сохранили адрес в строку
        URI uri = URI.create(url); // создали URI и передали в него адрес
        HttpClient client = HttpClient.newHttpClient();// создали объект класса HttpClient
        HttpRequest request = HttpRequest.newBuilder(uri).build(); // создали объект класса HttpRequest на адрес uri (запрос GET)
        HttpResponse<byte[]> response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());// методом send отправляем запрос request на client
        // указываем, что он должен содержать массив байт и сохраняем ответ в создаваемый объект класса HttpResponse (response - тип тоже массив байт(byte[]))

        //Поверка статуса:
        int status = response.statusCode();// с помощью метода statusCode() берем из ответа статус ответа и сохраняем его
        if (status == 200) {
            Files.write(file, response.body()); // сохраняем тело запроса в файл
        } else {
            System.out.println("Ошибка загрузки: код ответа : " + status);
            ArrayList<String> list = new ArrayList<>();
        }


    }
}
