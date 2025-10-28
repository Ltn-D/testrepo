package JAVA25.Level19_Abstract.Level5_TMP;

public class TaskService {
    private TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public void addTask(Task task) {
        repository.save(task);
    }
    public void completeTask(String title) {
        Task task = repository.findByTitle(title);
        if (task != null) {
            task.complete();
        } else {
            System.out.println("Задача не найдена: " + title);
        }
    }
    public void showAllTasks() {
        for (Task task : repository.findAll()) {
            System.out.println(task.getTitle() + " — " + (task.isCompleted() ? "выполнена" : "не выполнена"));
        }
    }
}
