package JAVA25.Level23_OOP_Errors_BestPractics.Lecture4_TMP;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, int issueNumber) {
        super(title);
        this.issueNumber = issueNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("Журнал: " + title + ", выпуск: " + issueNumber);
    }
}
