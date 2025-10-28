package JAVA25.Level19_Abstract.Lecture5_2;

public class TaskService {
    TaskRepository repository;
    public void addTask(Task task) {
        repository.addTask(task);
    }

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public void completeTask(String title) {
        if (repository.findByTitle(title) != null) {
            repository.findByTitle(title).complete();
        }
    }
}
