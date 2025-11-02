package JAVA25.Level6;

public class Lecture5_1 {
    public static void main(String[] args) {
        // Общая масса материала в килограммах
        double totalMaterialWeight = 7.89;
        // Явно приводим double к int — дробная часть отбрасывается
        int completeItemsCount = (int) totalMaterialWeight;
        // Выводим количество целых предметов
        System.out.println(completeItemsCount);
    }
}
