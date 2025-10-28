package Old_Javarush.Core.Level5_overload;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lecture7_2 {
    public static int A;
    public static int B;
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            A = Integer.parseInt(reader.readLine());
            B = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static final int MIN = min(A, B);

    static void main()  {

        System.out.println(MIN);

    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }


}
