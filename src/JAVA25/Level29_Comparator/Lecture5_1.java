package JAVA25.Level29_Comparator;

import java.util.ArrayList;
import java.util.List;

public class Lecture5_1 {
    public static void main(String[] args) {
        // Создаем список наблюдений животных
        List<String> animalSightings = new ArrayList<>();
        // Заполняем список в нужном порядке
        animalSightings.add("кот");
        animalSightings.add("пёс");
        animalSightings.add("кот");
        animalSightings.add("мышь");

        int firstIndex = animalSightings.indexOf("кот");// Находим индекс первого появления "кот" (встроенный метод List)

        int lastIndex = animalSightings.lastIndexOf("кот");// Находим индекс последнего появления "кот"


        // Выводим оба индекса через пробел
        System.out.println(firstIndex + " " + lastIndex);
    }
}
