package JAVA25.Level15_encapsulation;

public class Lecture1_2 {
    static void main(String[] args) {
        Person1 person1 = new Person1("Анна", 30);
        System.out.println("Имя: " + person1.getMemberName());
        System.out.println("Возраст: " + person1.getMemberAge());
    }
}

class Person {
    private String memberName;
    private int memberAge;

    public String getMemberName() {
        return memberName;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public Person(String memberName, int memberAge) {
        this.memberName = memberName;
        this.memberAge = memberAge;
    }
}