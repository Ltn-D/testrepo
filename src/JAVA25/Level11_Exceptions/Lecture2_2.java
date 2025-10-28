package JAVA25.Level11_Exceptions;

public class Lecture2_2 {
    static void main(String[] args) {
        int[] heroInventory = new int[]{101, 102, 103};
        try {
            System.out.println(heroInventory[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка! Такой ячейки в рюкзаке не существует. Индекс вне границ массива.");
        }
    }

}
