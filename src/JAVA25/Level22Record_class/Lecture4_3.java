package JAVA25.Level22Record_class;

public class Lecture4_3 {
    static record Person(String name, int age) {
        public static final String  SPECIES = "Homo sapiens";

        public  String greeting() {
            return String.format("Привет, меня зовут %s, мне %d лет. Я - %s",name ,age ,SPECIES);
        }
    }

    static void main(String[] args) {
        Person ivan = new Person("Иван", 25);
        System.out.println(ivan.greeting());
    }
}
