package Old_Javarush.Core.Level3_Interface;

public class Lecture6_1 {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    static class Cat implements Movable, Eat, Edible {
        @Override
        public void move() {
            System.out.println("кот бежит");
        }

        @Override
        public void eat() {
            System.out.println("кот ест");
        }

        @Override
        public void beEaten() {
            System.out.println("кот съеден");
        }
    }

    static abstract class Dog implements Movable, Eat {

    }

    static abstract class Mouse implements Movable, Edible {

    }
}
