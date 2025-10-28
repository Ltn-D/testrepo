package Old_Javarush.Core.Level2;

public class Lecture9_3 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.move();

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove{
        public void move(){
            System.out.println("i move");
        }

        public void eat() {
            System.out.println("i eat");
        }
    }

    public static class  Duck implements CanFly, CanEat, CanMove {
        @Override
        public void fly() {
            System.out.println("i fly");
        }
        public void move(){
            System.out.println("i move");
        }

        public void eat() {
            System.out.println("i eat");
        }
    }

    public class Car implements CanMove{
        public void move(){
            System.out.println("i move");
        }
    }

    public class Airplane implements CanMove, CanFly{
        public void fly() {
            System.out.println("i fly");
        }
        public void move(){
            System.out.println("i move");
        }
    }
}

