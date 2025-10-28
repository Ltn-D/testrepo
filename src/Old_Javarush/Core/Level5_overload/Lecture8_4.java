package Old_Javarush.Core.Level5_overload;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Lecture8_4 {
    static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = reader.readLine()).equals("exit")) {
            try {
                if (input.contains(".")) {
                    double value = Double.parseDouble(input);
                    print(value);
                } else {
                    int tmp = Integer.parseInt(input);
                    if (tmp > 0 && tmp < 128) {
                        short value = (short) tmp;
                        print(value);
                    } else {
                        print(tmp);
                    }
                }


            } catch (Exception e) {
                print(input);
            }
            }
        reader.close();
    }
    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }

}
