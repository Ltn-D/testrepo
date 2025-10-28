package Old_Javarush.Syntax.Collections;

import java.util.ArrayList;

public class Lecture3_3_sortArrayList {
    public static ArrayList<Integer> numbers = new ArrayList<Integer>();

    static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 10));
        }
        System.out.println(numbers);
        sort(numbers);
        System.out.println(numbers);
    }

    public static void sort(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {// количество проходов (на 1 меньше чем количество элементов
            for (int j = 0; j < numbers.size()-i-1; j++) {//сравниваем со следующим элементом и если больше меняем их местами
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int tmp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, tmp);
                }

            }

        }
    }
}
