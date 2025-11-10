package JAVA25.Level10_Enum_Switch;

public class Lecture4_1 {
    static enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }
    public static void main(String[] args) {
        // Создаем переменную типа Season и присваиваем ей значение SUMMER
        Season season = Season.SUMMER;

        // Для каждого сезона выводим свое жизнерадостное сообщение
        switch (season) {
            case AUTUMN:
                System.out.println("Пора за грибами!");
                break;
            case WINTER:
                System.out.println("Пора кататься на лыжах!");
                break;
            case SPRING:
                System.out.println("Ручьи побежали");
                break;
            case SUMMER:
                System.out.println("Лето — время отпусков!");
                break;
        }
    }
}
