package JAVA25.Level9_String;

public class Lecture5_2 {
    static void main(String[] args) {
        StringBuilder hello = new StringBuilder("Привет, мир!");
        hello.insert(hello.indexOf(",") + 2, "Java ");
        System.out.println(hello);
    }
}

