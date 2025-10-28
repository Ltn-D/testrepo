package Old_Javarush.Syntax.Collections;

import java.util.ArrayList;

public class Lecture3_1 {

    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        paySalary("Боргелейф");
        paySalary(null);
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);

    }

    public static void paySalary(String name) {
        if (waitingEmployees.contains(name) && name!= null) {
            alreadyGotSalaryEmployees.add(name);
            waitingEmployees.set(waitingEmployees.indexOf(name), null);
        }

    }
        //напишите тут ваш код
}

