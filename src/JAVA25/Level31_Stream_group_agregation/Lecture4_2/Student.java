package JAVA25.Level31_Stream_group_agregation.Lecture4_2;

public class Student {
    private String studentName;
    private int studyCourse;
    private String studentSpecialty;
    private double averageGrade;

    public Student(String studentName, int studyCourse, String studentSpecialty, double averageGrade) {
        this.studentName = studentName;
        this.studyCourse = studyCourse;
        this.studentSpecialty = studentSpecialty;
        this.averageGrade = averageGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudyCourse() {
        return studyCourse;
    }

    public String getStudentSpecialty() {
        return studentSpecialty;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}
