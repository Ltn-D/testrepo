package JAVA25.Level15_encapsulation;

public class Lecture1_3 {
    static void main(String[] args) {
        Person1 person = new Person1("Иван", 25);

        //person.setMemberAge(-5);
        //System.out.println(person.getMemberAge());
        person.setMemberAge(35);
        System.out.println(person.getMemberAge());
    }
}

class Person1 {
    private String memberName;
    private int memberAge;

    public void setMemberAge(int memberAge) {
        if (memberAge < 0) {
            throw new IllegalArgumentException("Возраст не может быть меньше 0");

        }
        this.memberAge = memberAge;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public Person1(String memberName, int memberAge) {
        this.memberName = memberName;
        this.memberAge = memberAge;
    }
}