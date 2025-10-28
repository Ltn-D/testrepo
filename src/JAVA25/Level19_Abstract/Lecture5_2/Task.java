package JAVA25.Level19_Abstract.Lecture5_2;

public class Task {
    private String title;
    private boolean complete = false;

    public String getTitle() {
        return title;
    }

    public Task(String title) {
        this.title = title;
    }

    public void complete() {
        this.complete = true;
    }

    public boolean isComplete() {
        return complete;
    }

    public String toString() {
        return ("Задача: " + getTitle() + " статус: " + (isComplete()? "выполнена": "не выполнена"));
    }
}
