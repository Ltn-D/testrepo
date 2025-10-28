package JAVA25.Level22Record_class;

public class Lecture4_1 {
    static record Temperature(double celsius) {
        public static Temperature fromFahrenheit(double fahrenheit) {
            return new Temperature((fahrenheit - 32)*5/9);
        }
    }
    static void main(String[] args) {
        Temperature boiling = Temperature.fromFahrenheit(212);

        System.out.println(boiling.celsius());
    }
}
