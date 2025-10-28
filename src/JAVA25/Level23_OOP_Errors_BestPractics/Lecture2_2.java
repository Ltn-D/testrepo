package JAVA25.Level23_OOP_Errors_BestPractics;

public class Lecture2_2 {
    static class Animal {
        public void makeSound() {
            System.out.println("Some sound");
        }
    }

    static class Dog extends Animal {
        public void makeSound(String intensity) {
            System.out.println("Bark! " + intensity);
        }
    }
    public static void main(String[] args) {
        // Создаем объект собаки
        Dog dog = new Dog();

        // Вызываем унаследованный метод без параметров (не переопределен в Dog)
        dog.makeSound(); // Выведет: Some sound

        // Вызываем перегруженную версию метода с параметром
        dog.makeSound("громко"); // Выведет: Bark! громко
    }

}
