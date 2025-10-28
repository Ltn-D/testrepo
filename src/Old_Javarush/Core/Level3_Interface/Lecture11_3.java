package Old_Javarush.Core.Level3_Interface;

import java.io.*;
import java.util.Scanner;

public class Lecture11_3 {
    static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        InputStream inStream = new FileInputStream(path);
        BufferedInputStream buffer = new BufferedInputStream(inStream);

        while (buffer.available() > 0) {
            char c = (char) buffer.read();
            System.out.print(c);
        }
        inStream.close();
        buffer.close();
    }
}
