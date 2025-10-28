package JAVA25.Level19_Abstract.Lecture5_1;

public class SimpleTask extends Task {
    public SimpleTask(String title) {
        super(title);
    }

    @Override
    public void complete() {
        System.out.println("Задача " + getTitle() + " выполнена");
    }
}
