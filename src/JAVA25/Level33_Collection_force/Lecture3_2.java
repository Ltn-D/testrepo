package JAVA25.Level33_Collection_force;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture3_2 {
    public static void main(String[] args) {
        // Обычный изменяемый список — мастер-список ингредиентов
        List<String> masterRecipeIngredients = new ArrayList<>();
        masterRecipeIngredients.add("Java");
        masterRecipeIngredients.add("Python");

        // Неизменяемое представление (обёртка) поверх мастер-списка.
        // Это не копия, а "вид" на исходный список: изменения в мастер-списке будут видны здесь.
        List<String> apprenticeRecipeView = Collections.unmodifiableList(masterRecipeIngredients);

        masterRecipeIngredients.add("C++");


        // Изменяем исходный мастер-список после создания представления


        // Выводим содержимое "гостевого меню": должно быть [Java, Python, C++]
        // Непосредственно менять apprenticeRecipeView нельзя — он неизменяемый.
        System.out.println(apprenticeRecipeView);
    }
}
