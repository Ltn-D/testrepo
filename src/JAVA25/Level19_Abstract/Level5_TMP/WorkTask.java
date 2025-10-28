package JAVA25.Level19_Abstract.Level5_TMP;

public class WorkTask extends Task {
    private String deadline;

    public WorkTask(String title, String deadline) {
        super(title);
        this.deadline = deadline;
    }

    @Override
    public void complete() {
        setCompleted(true);
        System.out.println("Рабочая задача '" + getTitle() + "' выполнена к сроку " + deadline);
    }
}
