import java.time.LocalDateTime;

public abstract class Task {
    private String title;
    private String description;
    private TaskType taskType;
    private LocalDateTime firstType;
    private boolean archived;
    private static Integer counter = 1;
    private final Integer id;

    protected Task(String title, String description, TaskType taskType, LocalDateTime firstType, boolean archived) {
        this.title = title;
        this.description = description;
        this.taskType = taskType;
        this.firstType = firstType;
        this.archived = archived;
        this.id = counter++;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public LocalDateTime getFirstType() {
        return firstType;
    }

    public boolean isArchived() {
        return archived;
    }

    public static Integer getCounter() {
        return counter;
    }

    public Integer getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public void setFirstType(LocalDateTime firstType) {
        this.firstType = firstType;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public static void setCounter(Integer counter) {
        Task.counter = counter;
    }
}
