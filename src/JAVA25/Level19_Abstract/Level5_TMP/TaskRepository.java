package JAVA25.Level19_Abstract.Level5_TMP;

import java.util.List;

public interface TaskRepository {
    void save(Task task);
    Task findByTitle(String title);
    List<Task> findAll();
}
