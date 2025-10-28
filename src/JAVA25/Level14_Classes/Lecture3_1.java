package JAVA25.Level14_Classes;

public class Lecture3_1 {
    static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.catName = "Барсик";
        barsik.catAge = 3;
        System.out.println(barsik.catName);
        System.out.println(barsik.catAge);
    }
}

class Cat {
    String catName;
    int catAge;
}
