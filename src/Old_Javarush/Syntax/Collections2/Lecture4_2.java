package Old_Javarush.Syntax.Collections2;

import java.util.HashMap;

public class Lecture4_2 {
    public static HashMap<String, Double> grades = new HashMap<>();

    static void main(String[] args) {
        addStudents();
        System.out.println("Список студентов группы: ");
        printStudents();
        System.out.println("Средний балл группы: " + getAverageMark());

    }
    public static void addStudents() {
        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        for (String name : grades.keySet()) {
            System.out.println(name);
        }
    }

    public static Double getAverageMark() {
        //Collection<Double> marks = grades.values();
        double sumMarks = 0;
        for (Double mark : grades.values()) {
            sumMarks += mark;
        }

        return  sumMarks / grades.size() ;

    }
}
