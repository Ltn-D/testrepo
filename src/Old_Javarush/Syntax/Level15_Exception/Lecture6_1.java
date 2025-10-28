package Old_Javarush.Syntax.Level15_Exception;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Lecture6_1 {

    public static void main(String[] args) {
        Map<String, Integer> screwdriverIngredients = makeScrewdriver();
        String screwdriver = screwdriverIngredients.keySet().stream()
                .map(key -> key + "=" + screwdriverIngredients.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(screwdriver);
    }

    static Map<String, Integer> makeScrewdriver() {
        Map<String, Integer> ingredients = new TreeMap<>();
        addIce(ingredients);
        addVodka(ingredients);
        addJuice(ingredients);
        addOrange(ingredients);
        return ingredients;
    }

    static void addIce(Map<String, Integer> ingredients) {
        Thread current = Thread.currentThread();// Получаем stack trace для метода (2 строки)
        StackTraceElement[] method = current.getStackTrace();
        try {
            ingredients.put("ice cubes", 7);
        } catch (Exception e) {
            printBugMethodName (method);
        }
    }

    static void addVodka(Map<String, Integer> ingredients) {

        StackTraceElement[] method = Thread.currentThread().getStackTrace();// Получаем stack trace для метода (1 строка - вместо current сразу указывает ее получение(Thread.currentThread())
        try {
            ingredients.put("vodka", 50);
        } catch (Exception e) {
            printBugMethodName (method);
        }
    }

    static void addJuice(Map<String, Integer> ingredients) {
        // StackTraceElement[] method = Thread.currentThread().getStackTrace(); не обязательно, можно сразу передать результат в метод
        try {
            ingredients.put(null, 100);
        } catch (Exception e) {
            printBugMethodName (Thread.currentThread().getStackTrace());// вот так, т.е. переменную  method не создаем, а сразу пишем в качестве аргумента метода)
        }
    }

    static void addOrange(Map<String, Integer> ingredients) {
        //Правильный вариант такой т.к. есть требование сто код метода д.б в  try-catch
        try {
            ingredients.put("orange slice", 1);
        } catch (Exception e) {
            printBugMethodName (Thread.currentThread().getStackTrace());
        }
    }

    public static void printBugMethodName(StackTraceElement[] stackTraceElements) {
        StackTraceElement stackTraceElement = stackTraceElements[1];
        System.out.println(stackTraceElement.getMethodName());
    }
}
