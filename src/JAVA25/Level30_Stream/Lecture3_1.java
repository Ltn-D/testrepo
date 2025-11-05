package JAVA25.Level30_Stream;

import java.util.List;


public class Lecture3_1 {
    public static void main(String[] args) {
        // Исходный список гостей в порядке очереди
        List<String> waiting = List.of("первый", "второй", "третий", "четвёртый", "пятый");

        // Пропускаем первых двух (VIP) с помощью Stream API и метода skip,
        List<String> regularGuests = waiting.stream()
                .skip(2)
                .toList();
        // формируем новый список из оставшихся гостей


        // Выводим окончательный список гостей, которым нужно выдать пропуска
        regularGuests.forEach(System.out::println);
    }
}

