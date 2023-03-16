import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TestData {
    public static void main(String[] args) {
        String d = "29,07.2018"; // Вместо точки указана запятая
        // Символ "\" не указан перед точкой
        Pattern p = Pattern.compile(
                "^[0-3][0-9].[01][0-9].[12][09][0-9][0-9]$");
        Matcher m = p.matcher(d);
        if (m.matches())
            System.out.println("Дата введена правильно");
        else
            System.out.println("Дата введена неправильно");
        // Так как точка означает любой символ, выведет:
        // Дата введена правильно

        // Символ "\" указан перед точкой
        p = Pattern.compile(
                "^[0-3][0-9]\\.[01][0-9]\\.[12][09][0-9][0-9]$");
        m = p.matcher(d);
        if (m.matches())
            System.out.println("Дата введена правильно");
        else
            System.out.println("Дата введена неправильно");
        // Так как перед точкой указан символ "\", выведет:
        // Дата введена неправильно

        // Точка внутри квадратных скобок
        p = Pattern.compile(
                "^[0-3][0-9][.][01][0-9][.][12][09][0-9][0-9]$");
        m = p.matcher(d);
        if (m.matches())
            System.out.println("Дата введена правильно");
        else
            System.out.println("Дата введена неправильно");
        // Выведет: Дата введена неправильно
    }
}
//import java.util.regex.Pattern;
//        import java.util.regex.Matcher;
//
//public class MyClass {
//    public static void main(String[] args) {
//        String d = "29,07.2018"; // Вместо точки указана запятая
//        // Символ "\" не указан перед точкой
//        Pattern p = Pattern.compile(
//                "^[0-3][0-9].[01][0-9].[12][09][0-9][0-9]$");
//        Matcher m = p.matcher(d);
//        if (m.matches())
//            System.out.println("Дата введена правильно");
//        else
//            System.out.println("Дата введена неправильно");
//        // Так как точка означает любой символ, выведет:
//        // Дата введена правильно
//
//        // Символ "\" указан перед точкой
//        p = Pattern.compile(
//                "^[0-3][0-9]\\.[01][0-9]\\.[12][09][0-9][0-9]$");
//        m = p.matcher(d);
//        if (m.matches())
//            System.out.println("Дата введена правильно");
//        else
//            System.out.println("Дата введена неправильно");
//        // Так как перед точкой указан символ "\", выведет:
//        // Дата введена неправильно
//
//        // Точка внутри квадратных скобок
//        p = Pattern.compile(
//                "^[0-3][0-9][.][01][0-9][.][12][09][0-9][0-9]$");
//        m = p.matcher(d);
//        if (m.matches())
//            System.out.println("Дата введена правильно");
//        else
//            System.out.println("Дата введена неправильно");
//        // Выведет: Дата введена неправильно
//    }
//}
