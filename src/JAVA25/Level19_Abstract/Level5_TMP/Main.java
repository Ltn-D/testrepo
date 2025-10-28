package JAVA25.Level19_Abstract.Level5_TMP;

public class Main {public static void main(String[] args) {
    TaskRepository repo = new InMemoryTaskRepository();
    TaskService service = new TaskService(repo);

    service.addTask(new WorkTask("Сделать отчёт", "2025-07-15"));
    service.addTask(new WorkTask("Подготовить презентацию", "2025-07-16"));

    service.showAllTasks();

    service.completeTask("Сделать отчёт");
    service.showAllTasks();
}
}