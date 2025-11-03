package JAVA25.Level8_Metod;

class MagicalContainer {
    // Публичное поле magicValue для хранения магического значения
    public int magicValue;
}

public class Lecture4_4 {
    public static void main(String[] args) {
        // Создаем объект класса MagicalContainer и присваиваем его переменной myTreasureChest
        MagicalContainer myTreasureChest = new MagicalContainer();

        // Инициализируем поле magicValue значением 15
        myTreasureChest.magicValue = 15;

        // Вызываем метод attemptToEnchantContainer с объектом myTreasureChest
        attemptToEnchantContainer(myTreasureChest);

        // Выводим значение magicValue объекта myTreasureChest на экран
        // Ожидаемое значение: 99
        System.out.println(myTreasureChest.magicValue);
    }

    // Метод attemptToEnchantContainer пытается изменить магическое значение и заменить объект
    public static void attemptToEnchantContainer(MagicalContainer container) {
        // Изменяем значение magicValue переданного объекта на 99
        container.magicValue = 99;


        // Пытаемся заменить объект на новый с magicValue равным 42
        container = new MagicalContainer();
        container.magicValue = 42;

    }

}
