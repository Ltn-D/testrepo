package JAVA25.Level21_Lambda;

public class Lecture2_4 {
    static class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    static interface AnimalFactory {
        Animal setAnimal(String name);
    }

    static void main(String[] args) {
        AnimalFactory factory = Animal::new;
        Animal cat = factory.setAnimal("Барсик");
        System.out.println(cat.getName());

    }
}
