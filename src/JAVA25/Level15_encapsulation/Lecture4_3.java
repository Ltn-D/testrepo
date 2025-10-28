package JAVA25.Level15_encapsulation;

public class Lecture4_3 {
    public static void main(String[] args) {
        // Выводим значение языка по умолчанию, обращаясь к полю через имя класса
        System.out.println(ApplicationConfiguration.APPLICATION_DEFAULT_LANGUAGE);
    }
}

class ApplicationConfiguration {
    public static final String APPLICATION_DEFAULT_LANGUAGE;
    static {
        String lang = System.getenv("APP_LANG");
        if (lang != null) {
            APPLICATION_DEFAULT_LANGUAGE = lang;

        } else {
            APPLICATION_DEFAULT_LANGUAGE = "en";
        }
    }
}
