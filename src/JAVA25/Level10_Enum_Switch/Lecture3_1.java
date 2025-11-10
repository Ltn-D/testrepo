package JAVA25.Level10_Enum_Switch;

import java.util.Scanner;

public class Lecture3_1 {
    public static void main(String[] args) {
        // Создаем Scanner для чтения числа с клавиатуры
        Scanner console = new Scanner(System.in);
        int day = console.nextInt();

        // Используем классический switch для определения дня недели
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            default:
                System.out.println("Неизвестный день");
        }

    }
}
