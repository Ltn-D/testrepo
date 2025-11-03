package JAVA25.Level8_Metod;

public class Lecture5_4 {
    static class SchoolStudent {
        public String studentName;
        private int studentAge;

        public void setStudentAge(int ageToSet) {
            this.studentAge = ageToSet;
        }

        public void displayStudentProfile() {
            System.out.println("Имя: " + studentName + ", возраст: " + studentAge);
        }
    }
    public static void main(String[] args) {
        // Создаём новую запись об ученике
        SchoolStudent newPupil = new SchoolStudent();

        // Имя можно присвоить напрямую — поле публичное
        newPupil.studentName = "Мария";

        // Возраст задаётся только через публичный метод (инкапсуляция)
        newPupil.setStudentAge(16);
        // Выведем аккуратный профиль ученика
        newPupil.displayStudentProfile();
        // Попытка прямого изменения приватного поля — это нарушение инкапсуляции.

    }
}
