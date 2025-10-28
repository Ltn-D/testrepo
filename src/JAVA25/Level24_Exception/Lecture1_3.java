package JAVA25.Level24_Exception;

import java.io.FileNotFoundException;

public class Lecture1_3 {
    public static void main(String[] args) {
        // "Неожиданный сбой": RuntimeException — непроверяемое (unchecked) исключение
        RuntimeException unexpectedGlitch = new RuntimeException("Неожиданный сбой : RuntimeException — непроверяемое (unchecked) исключение");
        // "Потерянный файл конфигурации": FileNotFoundException — проверяемое (checked) исключение
        FileNotFoundException missingConfigurationFile = new FileNotFoundException("Потерянный файл конфигурации: FileNotFoundException — проверяемое (checked) исключение");


        // Выводим классификацию исключений
        System.out.println(unexpectedGlitch.getClass().getSimpleName() + " - unchecked");
        System.out.println(missingConfigurationFile.getClass().getSimpleName() + " - checked");

    }

}
