package JAVA25.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Lecture2_2 {
    static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String treasureAmount = reader.readLine();
        reader.close();
        System.out.println(treasureAmount.length());

    }
}
