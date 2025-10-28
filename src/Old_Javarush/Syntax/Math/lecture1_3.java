package Old_Javarush.Syntax.Math;

import java.util.Scanner;
import java.util.Arrays;

public class lecture1_3 {
    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(Arrays.toString(intArray));
        System.out.println(min(intArray));
    }
    public static int min(int[] ints) {
        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            min = Math.min(min, ints[i]);
        }
        //напишите тут ваш код
        return min;
    }
    public static int[] getArrayOfTenElements() {
        int[] array = new int[10];//напишите тут ваш код
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array[i] = console.nextInt();

        }
        return array;
    }
}
