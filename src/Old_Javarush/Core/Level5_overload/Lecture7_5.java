package Old_Javarush.Core.Level5_overload;

public class Lecture7_5 {
    public static Cat cat;



    static class Cat {
        public String name = "fsadef";
    }


    static  {
        Lecture7_5.cat = new Cat();
        cat.name = "sdfsdf";


    }
    static void main(String[] args) {
        System.out.println(cat.name);

    }
}
