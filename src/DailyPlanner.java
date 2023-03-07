import java.lang.invoke.WrongMethodTypeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.Scanner;
import java.io.IOException;

public class DailyPlanner {
    private static final Map<Integer, Repeatable> actualTask = new HashMap<>();
    private static final Map<Integer, Repeatable> archivedTask = new HashMap<>();

    public static void addTask(Scanner scanner)   { //throws WrongInputException
//        try {
            scanner.nextLine();
            System.out.println("Введите название задачи: ");
            String title = scanner.nextLine();
            System.out.println("Введите описание задачи: ");
            String description = scanner.nextLine();
            System.out.println("Введите повторяемость задачи: однократная - 0, " +
                    "ежедневная: - 1.");
            TaskType taskType = TaskType.values()[Integer.parseInt(scanner.nextLine())];
            int occurrence = scanner.nextInt();
            System.out.println("Введите дату в формате: dd.MM.yyyy");
            scanner.nextLine();
            LocalDateTime eventDate = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//            createEvent(scanner, title, description, taskType, occurrence);

//        } catch (WrongInputException e) {
//            System.out.println(e.getMessage());
//        }
    }

//    private static void createEvent(Scanner scanner, String title, String description, TaskType taskType, int occurrence) {
//        try {
//            LocalDateTime eventDate = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//            Repeatable task = null;
//            try {
//                task = createTask(occurrence, title, description, taskType, eventDate);
//                System.out.println("Создана задача " + task);
//            } catch (WrongInputException e){
//                System.out.println(e.getMessage());
//            }
//        } catch (DateTimeParseException e) {
//            System.out.println("Проверьте формат dd.MM.yyyy и попробуйте ещё раз.");
//            createEvent(scanner, title, description, taskType, occurrence);
//        }
//    }
//
//    private static Repeatable createTask(int occurrence, String title, String description, TaskType taskType, LocalDateTime localDateTime)  { //throws WrongInputException
//         switch (occurrence){
//            case 0 :
////                OnceTask onceTask = new OnceTask(title, description, taskType, localDateTime);
////                actualTask.put(onceTask.getId(), onceTask);
////                yield onceTask;
//                System.out.println();
//            break;
//            case 1:
////                DailyTask task = new DailyTask(title, description, taskType, localDateTime);
////                actualTask.put(task.getId(), task);
//                System.out.println("1");
//
//                break;
////            }
//            default : ;
//            break;
//        };
//    }
//    public static void editTask() {
//    }
//
//    public static void deleteTask(Scanner scanner) {
//        System.out.println("Текущие задачи\n");
////        printActualTasks();
//        System.out.println("Для удаления введите id задачи: ");
//        int id = scanner.nextInt();
//        if (actualTask.containsKey(id)) {
//            Repeatable removedTask = actualTask.get(id);
//            removedTask.setArchived(true);
//            archivedTask.put(id, removedTask);
//            System.out.println("Задача " + id + " удалена\n");
//        } else {
//            System.out.println("Такой задачи не существует\n");
//        }
//    }

    public static void getTaskByGroup() {
    }

    public static void printArchived() {
    }

    public static void getGroupByDate() {
    }

//    private static List<Repeatable> findTaskByDate(LocalDate date) {
//        List<Repeatable> task = new ArrayList<>();
//        for (Repeatable task : actualTask.values()){
//            if (task.checkOccurrence(date.atStartOfDay())) {
////                tasks.add(task);
//            }
//        }
//    }
}