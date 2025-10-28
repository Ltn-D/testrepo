package JAVA25.Level15_encapsulation;

public class Lecture3_2 {
    static void main(String[] args) {
        StudentProfile profile = new StudentProfile(18);
        profile.setStudentAge(20);
        System.out.println(profile.getStudentAge());
    }
}

class StudentProfile {
    private int studentAge;

    public StudentProfile(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}
