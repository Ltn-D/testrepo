package Old_Javarush.Core.Level3_Interface;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Lecture11_10 {
    static void main() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        Scanner scanner = new Scanner(inputStream);
        List<Integer> inputList = new ArrayList<>();
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            inputList.add(a);
        }
        inputStream.close();
        scanner.close();
        for (Integer i: inputList) {
            System.out.println(i);
        }
        System.out.println("_____");
        List<Integer> outList = inputList.stream()
                .filter(integer -> integer%2==0)
                .sorted()
                .collect(Collectors.toList());
        for (Integer i: outList) {
            System.out.println(i);
            }
    }
}
