package Old_Javarush.Syntax.Level18_OOP.Lecture4_3;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();
    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
            }
    public static void runWorkingProcess() {
        for (Astronaut astronaut : astronauts) {
            if (astronaut instanceof Human) {
                pilot((Human) astronaut);
            } else if (astronaut instanceof Cat) {
                research((Cat) astronaut);
            } else if (astronaut instanceof Dog) {
                createDirection((Dog) astronaut);
            }
        }
    }


    public static void pilot(Human human){
        System.out.println("Член экипажа " + human.getInfo() + " пилотирует корабль.");
    }

    public static void createDirection(Dog dog){
        System.out.println("Член экипажа " + dog.getInfo() + " занимается созданием навигационного маршрута.");
    }

    public static void research(Cat cat){
        System.out.println("Член экипажа " + cat.getInfo() + " исследует ближайшие планеты.");
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
