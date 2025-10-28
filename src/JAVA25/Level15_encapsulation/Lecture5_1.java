package JAVA25.Level15_encapsulation;

public class Lecture5_1 {
    static void main(String[] args) {
        new ApplicationModule();
    }
}

class ApplicationModule {
    static String moduleStatusMessage;
    static {
        moduleStatusMessage = "Приложение: Главный модуль готов к работе!";
        System.out.println(moduleStatusMessage);
    }

}