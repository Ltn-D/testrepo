package JAVA25.Level5;

import java.util.Scanner;

public class Lecture1_1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magicLimit = scanner.nextInt();
        for (int i = 1; i <=magicLimit ; i++) {
            System.out.println(i * i);
        }
    }
}
