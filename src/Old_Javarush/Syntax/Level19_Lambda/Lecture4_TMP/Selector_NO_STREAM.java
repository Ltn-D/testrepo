package Old_Javarush.Syntax.Level19_Lambda.Lecture4_TMP;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Selector_NO_STREAM {
    static void main(String[] args) {
        Init.initData();
        List<String> findNames = new ArrayList<>();
        List<Cat> findCats = new ArrayList<>();
        for (Owner owner : Init.owners) {
            for (Animal pet : owner.getPets()) {
                if (pet.getColor() == Color.FOXY && pet.getClass().equals(Cat.class)) {
                    findCats.add((Cat) pet);
                }
            }
        }
        Collections.sort(findCats,(c1,c2)->c1.getAge() - c2.getAge());
        findCats.forEach(c-> findNames.add(c.getName()));
        findNames.forEach(System.out::println);

    }
}


