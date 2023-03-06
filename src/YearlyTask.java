import java.time.LocalDateTime;

public class YearlyTask extends Task implements Repeatable{
    protected YearlyTask(String title, String description, TaskType taskType, LocalDateTime localDateTime, boolean archived) {
        super(title, description, taskType, localDateTime, archived);
    }

    @Override
    public boolean checkOccurrence(LocalDateTime requestedDate) {
        return getFirstDate().getYear() == requestedDate.getYear();
    }
}
