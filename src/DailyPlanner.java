import java.lang.invoke.WrongMethodTypeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.Scanner;

public class DailyPlanner {
    private static final Map<Integer, Repeatable> actualTask = new HashMap<>();
    private static final Map<Integer, Repeatable> archivedTask = new HashMap<>();

    public static void addTask(Scanner scanner) {
        try {
            scanner.nextLine();
            System.out.println("Введите название задачи: ");
            String title = scanner.nextLine();
            System.out.println("Введите описание задачи: ");
            String description = scanner.nextLine();
            System.out.println("Введите повторяемость задачи: однократная - 0, " +
                    "ежедневная: - 1.");
            TaskType taskType = TaskType.values()[scanner.nextLine()];
            int occurrence = scanner.nextInt();
            System.out.println("Введите дату в формате: dd.MM.yyyy");
            scanner.nextLine();
            createEvent(scanner, title, description, taskType, occurrence);

        } catch (WrongInputException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void createEvent(Scanner scanner, String title, String description, TaskType taskType, int occurrence) {
        try {
            LocalDateTime eventDate = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            Repeatable task = null;
            try {
                task = createTask(occurrence, title, description, taskType, eventDate);
                System.out.println("Создана задача " + task);
            } catch (WrongInputExeption e){
                System.out.println(e.getMessage);
            }
        } catch (DateTimeParseException e) {
            System.out.println("Проверьте формат dd.MM.yyyy и попробуйте ещё раз.");
            createEvent(scanner, title, description, taskType, occurrence);
        }
    }

    private static Repeatable createTask(int occurrence, String title, String description, TaskType taskType, LocalDateTime localDateTime) throws WrongInputException {
        return switch (occurrence){
            case 0 -> {
                OnceTask onceTask = new OnceTask(title, description, taskType, localDateTime);
                actualTask.put(onceTask.getId(), onceTask);
                yield onceTask;
            }
            case 1 -> {
                DailyTask task = new DailyTask(title, description, taskType, localDateTime);
                actualTask.put(task.getId(), task);
            }
            default -> null;
        };
    }
    public static void editTask() {
    }

    public static void deleteTask(Scanner scanner) {
        System.out.println("Текущие задачи\n");
        printActualTasks();
        System.out.println("Для удаления введите id задачи: ");
        int id = scanner.nextInt();
        if (actualTask.containsKey(id)) {
            Repeatable removedTask
        }
    }

    public static void getTaskByGroup() {
    }

    public static void printArchived() {
    }

    public static void getGroupByDate() {
    }
}