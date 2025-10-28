package Old_Javarush.Syntax.functios;

public class lecture2_3 { public static void main(String[] args) {
    int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
    printArray(array);
    reverseArray(array);
    printArray(array);
}

    public static void reverseArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1-i] = temp;

        }
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
