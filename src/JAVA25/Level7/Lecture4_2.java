package JAVA25.Level7;

public class Lecture4_2 {
    public static void main(String[] args) {
        // Объявляем и инициализируем зубчатый массив guestLists,
        String[][] guestLists = new String[][]{
                {"Анна", "Борис"},
                {"Петр", "Иван", "Николай"},
                {"Сергей Иванович"}
        };
        // где каждая вложенная строка — список гостей за отдельным столом
        // Стол 1: два гостя
        // Стол 2: три гостя
        // VIP-стол 3: один гость

        // Внешний цикл for-each: перебираем каждый подмассив (каждый стол)
        for (String[] table : guestLists) {// Внутренний цикл for-each: выводим поочерёдно имена гостей текущего стола
            for (String guest : table) {
                System.out.print(guest + " ");// выводим имя и пробел
            }
            System.out.println();// После вывода всех гостей одного стола — перевод строки
        }
    }
}
