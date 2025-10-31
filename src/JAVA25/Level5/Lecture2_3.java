package JAVA25.Level5;

import java.util.Scanner;

public class Lecture2_3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pathOne = scanner.nextInt();
        int pathTwo = scanner.nextInt();
        int pathThree = scanner.nextInt();
        scanner.close();
        System.out.println(Math.min(pathOne, Math.min(pathTwo,pathThree)));
    }
}
