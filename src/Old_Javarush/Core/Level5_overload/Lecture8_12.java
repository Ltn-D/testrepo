package Old_Javarush.Core.Level5_overload;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Lecture8_12 {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String url = reader.readLine();
        String url = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";
        //напишите тут ваш код
        int index1 = url.indexOf("?");
        String param = url.substring(index1+1);

        List<String> params = Arrays.asList(param.split("&"));
        String obj = null;
        for (String s : params) {
            if (s.contains("=")) {
                System.out.print(s.substring(0, s.indexOf("=")) + " ");
                if (s.contains("obj")) {
                     obj = s.substring(s.indexOf("=") + 1);
                }
            } else {
                System.out.print(s + " ");
            }


            }
        System.out.println();
        if (obj!=null) {
            try {
                Double value = Double.parseDouble(obj);
                alert(value);
            } catch (NumberFormatException e) {
                alert(obj);
            }
        }
        //System.out.println(param);



    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

