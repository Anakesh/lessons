package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        String string = "Строка В1 \"для_поиска\" и замены СИМВОЛОВ ё";
        String pattern = "иск";
        System.out.println(string.replaceAll(pattern, "*!*"));
        pattern = "^Стр";
        // ^ - начало строки
        // $ - конец строки
//        "^Стр$" - строка должна быть равна Стр
        System.out.println(string.replaceAll(pattern, "*!*"));
        pattern = "[иск]"; // перечень символов []
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[^иск]";
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\d"; // цифровой символ
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\D"; // не (d)цифровой символ
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\w"; // буквенно-цифровой символ или _
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\W"; // не w
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\s"; // любой пробельный символ
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\S"; // любой не пробельный символ
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[а-яё]"; //
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[А-Я0-9]"; // [А-Я][0-9]
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "и{2,4}"; // [А-Я][0-9]
        System.out.println(string.replaceAll(pattern, "*"));
        string = "Строка В1 для_поииииска и замены СИМВОЛОВ ё";
        pattern = "[иИ]{3}"; // [А-Я][0-9]
        System.out.println(string.replaceAll(pattern, "*"));
        string = "Строка В1 [для_поииииска] и замены СИМВОЛОВ ё";
        pattern = "[\\[\\]]";
        System.out.println(string.replaceAll(pattern, "*"));

        pattern = "[\\[\\]]";
        System.out.println(string.replaceAll(pattern, "*"));

        string = "Строка В1 [для_поииииска] и замены СИМВОЛОВ ё";
        pattern = "(ии|ff)";
        System.out.println(string.replaceAll(pattern, "*"));


//        Pattern | Matcher
        string = "String В  7 to search and replace CHRR";
//        string = "Str";
        Pattern pattern1 = Pattern.compile(".{6}");
        pattern1 = Pattern.compile("(.*\\d)(.*[a-z])(.*[A-Z]).{8,}");
//        pattern1 = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern1.matcher(string);
        System.out.println(matcher.find()); // true | false
        System.out.println(matcher.matches()); // true | false




















    }
}
