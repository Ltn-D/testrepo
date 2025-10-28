package JAVA25.Level19_Abstract.Lecture5_3;

public class UserInterface {
    public TaskService taskService;

    public UserInterface(TaskService taskService) {
        this.taskService = taskService;
    }
    public void addAndCompleteTask(String title) {
        taskService.addTask(title);
        taskService.completeTask(title);
        Task task =taskService.repository.findByTitle(title);
        System.out.println(task);
    }
}
