package JAVA25.Level5;

import java.util.Scanner;

public class lecture1_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку");
        String magicMessage = console.nextLine();
        String newString = "";
        for (int i = magicMessage.length() - 1; i >=0 ; i--) {
            newString += magicMessage.charAt(i);

        }
        System.out.println(newString);
    }

}
