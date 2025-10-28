package Old_Javarush.Core.Level4_instanseof.LEcture8_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        while (true) {
            key = reader.readLine();
            //создаем объект, пункт 2
            switch (key) {
                case "user"-> person = new Person.User();
                case "loser"-> person = new Person.Loser();
                case "coder" -> person = new Person.Coder();
                case "proger" -> person = new Person.Proger();
                default -> {
                    return;
                }
            }

            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }

}
