import java.time.LocalDateTime;

public class WeeklyTask extends Task implements Repeatable{
    protected WeeklyTask(String title, String description, TaskType taskType, LocalDateTime localDateTime, boolean archived) {
        super(title, description, taskType, localDateTime, archived);
    }

    @Override
    public boolean checkOccurrence(LocalDateTime requestedDate) {
        return getFirstDate().getDayOfWeek().equals(requestedDate.getDayOfWeek());
    }
}
