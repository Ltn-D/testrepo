package JAVA25.Level7;

public class Lecture1_3 {
    public static void main(String[] args) {
        // Объявляем массив для хранения четырёх показаний датчиков
        double[] sensorReadings = new double[4];
        // В элемент с индексом 2 (третий по счёту) записываем значение 3.14
        sensorReadings[2] = 3.14;
        // Выводим все значения массива в одну строку, разделяя их пробелом
        for (int i = 0; i < sensorReadings.length; i++) {
            if (i < sensorReadings.length - 1) {
                System.out.print(sensorReadings[i] + " ");
            }
            else System.out.println(sensorReadings[i]);
        } // После каждого элемента, кроме последнего, выводим пробел
    }
}
