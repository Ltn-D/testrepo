package Old_Javarush.Core.Level4_instanseof;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lecture8_11 {
    static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        reader.close();
        while (a != 0 && b != 0) {
            if (a > b)  {
                a = a % b;
            } else b = b % a;
        }
        System.out.println(a + b);

    }

}
