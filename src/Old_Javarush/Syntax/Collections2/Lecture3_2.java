package Old_Javarush.Syntax.Collections2;

import java.util.Collections;
import java.util.ArrayList;

public class Lecture3_2 {
    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void rotate(ArrayList<Integer> list, int distance) {
        Collections.rotate(list,distance);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }

    static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<>();
        Collections.addAll(testList, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(testList);
        rotate(testList,5);
        System.out.println(testList);
        shuffle(testList);
        System.out.println(testList);
    }

}

