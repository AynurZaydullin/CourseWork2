//импорт пакета для работы с консолью
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar cannes = new GregorianCalendar(2023, Calendar.AUGUST, 2, 15, 30);
        GregorianCalendar sss = new GregorianCalendar(2023, Calendar.AUGUST, 2);
        DateFormat df = new SimpleDateFormat("dd MMM yyy");
        String date3 = df.format(cannes.getTime());
        String date4 = df.format(sss.getTime());
        System.out.println(date3.equals(date4));
        System.out.println(cannes.equals(sss));
        System.out.println(cannes);
        System.out.println(df.format(cannes.getTime()));
//        try (Scanner scanner = new Scanner(System.in)) {
//            label:
//            while (true) {
//                printMenu();
//                System.out.print("Выберите пункт меню: ");
//                if (scanner.hasNextInt()) {
//                    int menu = scanner.nextInt();
//                    switch (menu) {
//                        case 1:
//                            DailyPlanner.addTask(scanner);
//                            break;
//                        case 2:
//                            DailyPlanner.editTask();
//                            break;
//                        case 3:
//                            DailyPlanner.deleteTask(scanner);
//                            break;
//                        case 4:
//                            DailyPlanner.getTaskByGroup();
//                            break;
//                        case 5:
//                            DailyPlanner.printArchived();
//                            break;
//                        case 6:
//                            DailyPlanner.getGroupByDate();
//                            break;
//                        case 0:
//                            break label;
//                    }
//                } else {
//                    scanner.next();
//                    System.out.println("Выберите пункт меню из списка!");
//                }
//            }
//        }
    }

    private static void inputTask(Scanner scanner) {
        System.out.print("Введите название задачи: ");
        String taskName = scanner.next();
        // todo
    }

    private static void printMenu() {
        System.out.println(
                "1. Добавить задачу  2. Удалить задачу 3. Получить задачу на указанный день 0. Выход"
        );
    }
}
