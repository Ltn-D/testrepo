package Old_Javarush.Syntax.Objekts;

import java.util.Arrays;

public class Lecture6_1 {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);

        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String[] arr = new String[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                arr[j] = array[i];
                j += 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = arr[i];
        }
    }
}
