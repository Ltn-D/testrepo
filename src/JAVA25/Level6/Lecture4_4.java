package JAVA25.Level6;

import java.text.DecimalFormat;

public class Lecture4_4 {
    public static void main(String[] args) {
        // Объявляем и инициализируем сумму мировых продаж (в миллионах)
        double totalGlobalSales = 12345678.9012;

        // Шаблон "#,##0.00" — добавляет разделители тысяч и ровно 2 знака после запятой
        DecimalFormat df = new DecimalFormat("#,##0.00");


        // Форматируем и выводим результат на экран
        System.out.println(df.format(totalGlobalSales));

    }
}
