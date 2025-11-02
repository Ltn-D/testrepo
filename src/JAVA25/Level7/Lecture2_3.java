package JAVA25.Level7;

public class Lecture2_3 {
    public static void main(String[] args) {
        // Создаем массив с быстрой инициализацией
        int[] itemPrices = {5, 7, 2, 9};
        // Переменная для хранения суммы
        int summ = 0;
        // Суммируем все элементы массива
        for (int item : itemPrices) {
            summ += item;
        }
        System.out.println(summ);// Выводим итоговую сумму на экран
    }
}
