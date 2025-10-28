package Old_Javarush.Syntax.Level19_Lambda;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Lecture5_1TMP {
    static void main() throws URISyntaxException {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<String> stream1 = stream.map(String::valueOf);
        stream1.forEach(System.out::println);
        ArrayList<String> list = new ArrayList<String>();
        list.add("https://google.com");
        list.add("https://linkedin.com");
        list.add("https://yandex.com");
        Stream<URI> stream2 = list.stream().map(str ->
        {
            try
            {
                return new URI(str);
            }
            catch (URISyntaxException e)
            {
                e.printStackTrace();
                return null;
            }
        });
    }
}
