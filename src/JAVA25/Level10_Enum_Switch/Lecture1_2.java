package JAVA25.Level10_Enum_Switch;

public class Lecture1_2 {
    public static void main(String[] args) {
        // Объявляем переменную типа char и присваиваем ей символ '7'
        char ch = '7';

        // Используем класс-обёртку Character для проверки, является ли символ цифрой
        boolean isDigit = Character.isDigit(ch);
        // Выводим результат проверки на экран
        System.out.println(isDigit);

    }
}
