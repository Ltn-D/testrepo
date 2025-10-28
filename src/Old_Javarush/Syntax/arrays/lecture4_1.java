package Old_Javarush.Syntax.arrays;

import java.util.Scanner;

public class lecture4_1 {
    public static String[] strings;
    public static void main(String[] args) {
        strings = new String[6];
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            strings[i] = console.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            for (int j = i+1; j < strings.length; j++) {
               //System.out.println(strings[i] + " " + strings[j] + ", ");
                if (strings[i] == null){
                    continue;
                }
                if (strings[i].equals(strings[j])) {
                    strings[i] = null;
                    strings[j] =null;
                }
                //System.out.println("!" + strings[i] + " " + strings[j] + ", ");

            }
        }
        for (int i=0; i < 6; i++) {
            System.out.print(strings[i] + ", ");
        }

    }
}
