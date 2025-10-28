package Old_Javarush.Core.Level5_overload;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Lecture8_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigDecimal fact = new BigDecimal(1);
        fact = factor(n);
        return fact.toString();

    }

    static BigDecimal factor(int i) {
        if (i < 0) {
            return BigDecimal.valueOf(0);
        } else if (i<=1) {
            return BigDecimal.valueOf(1);
        }else
        return BigDecimal.valueOf(i).multiply(factor(i-1));
    }
}
