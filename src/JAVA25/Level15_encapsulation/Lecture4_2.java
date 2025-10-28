package JAVA25.Level15_encapsulation;

public class Lecture4_2 {
    public static void main(String[] args) {
        // Создаем удостоверение с именем "Алиса"
        StudentIdentityCard card = new StudentIdentityCard("Алиса");

        // Выводим имя студента через геттер
        System.out.println(card.getStudentName());

        // Попытка изменить имя невозможна:
        //card.studentName = "Боб"; // так нельзя — поле приватное и final (ошибка компиляции)
    }
}

class StudentIdentityCard {
    private final String studentName;

    public String getStudentName() {
        return studentName;
    }

    public StudentIdentityCard(String initialName) {
        this.studentName = initialName;
    }
}
