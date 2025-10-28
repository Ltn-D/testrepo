package Old_Javarush.Syntax.Level19_Lambda.Lecture1_2;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return -(o1.getAge() - o2.getAge());
    }
}
