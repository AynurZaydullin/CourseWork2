import java.time.LocalDateTime;

public class OnceTask extends Task implements Repeatable {
    protected OnceTask(String title, String description, TaskType taskType, LocalDateTime localDateTime) {
        super(title, description, taskType, localDateTime);

    }

    @Override
    public boolean compareParametersOfDate(LocalDateTime requestedDate) {
        return false;
    }
}
