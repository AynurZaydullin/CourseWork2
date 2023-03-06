import java.time.LocalDateTime;

public class DailyTask extends Task implements Repeatable{
    protected DailyTask(String title, String description, TaskType taskType, LocalDateTime firstType, boolean archived) {
        super(title, description, taskType, firstType, archived);
    }
}
