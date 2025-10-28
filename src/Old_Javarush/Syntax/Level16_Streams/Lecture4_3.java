package Old_Javarush.Syntax.Level16_Streams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Lecture4_3 {

    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething("Тест");
        String result = outputStream.toString();
        outputStream.reset();
        char[] tmp = result.toCharArray();
        for (int i = 0; i < tmp.length / 2; i++) {
            char temp = tmp[i];
            tmp[i] = tmp[tmp.length - 1 - i];
            tmp[tmp.length - 1 - i] = temp;
        }
        String reverse = new String(tmp);
        printSomething(reverse);
       /* StringBuilder reverse1 = new StringBuilder(result); с использованием класса StringBuilder все проще
        printSomething(reverse1.reverse().toString());*/
        System.out.println(outputStream);
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}
