package Old_Javarush.Core.Level5_overload.Lecture8_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println(result.getClass().getSimpleName());

    }

    static {
        try {
            reset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String in = reader.readLine();
        if (in.equals("helicopter")) {
            result = new Helicopter();
        } else if (in.equals("plane")) {
            int count = Integer.parseInt(reader.readLine());
            result = new Plane(count);
        }

        //add your code here - добавьте код тут
    }
}