package JAVA25.Level6;

public class Lecture5_4 {
    public static void main(String[] args) {
        // Объявляем переменную типа int для оценки за контрольную
        int quizScore = 4;
        // Объявляем переменную типа double для оценки за проект
        double projectScore = 2.7;
        // Вычисляем точный средний балл (double) и сохраняем в exactCourseAverage
        double exactCourseAverage = (quizScore + projectScore) / 2;
        // Преобразуем точный средний балл (double) в целое число (int) и сохраняем в roundedCourseAverage
        int roundedCourseAverage = (int) exactCourseAverage;
        // Выводим точный средний балл на экран
        System.out.println(exactCourseAverage);
        // Выводим округленный средний балл на экран
        System.out.println(roundedCourseAverage);
        double x = 0.1 + 0.2;
        System.out.println(x);
        System.out.println(Math.floor(2.7));
    }
}
