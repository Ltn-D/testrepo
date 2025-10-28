package Old_Javarush.Syntax.Level18_OOP.Lecture4_1;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();
    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
        Astronaut human1 = new Human();
        astronauts.add(human1);
        Astronaut human2 = new Human();
        astronauts.add(human2);
        Astronaut cat = new Cat();
        astronauts.add(cat);
        Astronaut dog = new Dog();
        astronauts.add(dog);
        //напишите тут ваш код
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }

}
