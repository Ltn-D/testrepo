package JAVA25.Level6;

import java.text.DecimalFormat;

public class Lecture4_3 {
    public static void main(String[] args) {
        double quarterlyRevenue = 3.1;// Объявляем переменную для квартального дохода и присваиваем ей значение
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(quarterlyRevenue));


        // Создаем форматер, который всегда выводит ровно две цифры после запятой
        // Шаблон "0.00" гарантирует наличие хотя бы одной цифры до запятой и двух после


        // Форматируем число и выводим результат на экран

    }

}
