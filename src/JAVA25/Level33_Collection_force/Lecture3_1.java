package JAVA25.Level33_Collection_force;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture3_1 {
    public static void main(String[] args) {
        // Шаг 1. Создаем обычный изменяемый список ArrayList и добавляем три редкие книги
        List<String> rareBooks = new ArrayList<>();
        rareBooks.add("Кодекс Ветров");
        rareBooks.add("Гримуар Света");
        rareBooks.add("Хроники Звёздной Пыли");

        // Шаг 2. Создаем неизменяемую обёртку поверх исходного списка.
        // Важно: unmodifiableList не копирует элементы, а создает "вид" (view) над тем же ArrayList,
        // поэтому сохраняется ссылочная связь с исходным списком.
        List<String> protectedCatalog =  Collections.unmodifiableList(rareBooks);
        rareBooks.add("Test");// все равно дает изменять
        protectedCatalog.add("test1");//выкинет исключение т.к. это защищенная обертка.


        // Шаг 3. Выводим содержимое защищённого каталога
        System.out.println("Содержимое защищённого каталога:");
        for (String book : protectedCatalog) {
            System.out.println(book);
        }
    }
}
