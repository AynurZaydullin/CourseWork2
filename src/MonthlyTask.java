import java.time.LocalDateTime;

public class MonthlyTask extends Task implements Repeatable{
    protected MonthlyTask(String title, String description, TaskType taskType, LocalDateTime localDateTime) {
        super(title, description, taskType, localDateTime);
    }

    @Override
    public boolean checkOccurrence(LocalDateTime requestedDate) {
        return (getFirstDate().getDayOfMonth() == requestedDate.getDayOfMonth());
    }
}
