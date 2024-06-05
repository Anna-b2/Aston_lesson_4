package ArrayOfWords;
import java.util.*;
public class ArrayOfWords {
    public static void main(String[] args){
        List<String> fruits = Arrays.asList(
                "Апельсин", "Банан", "Персик", "Нектарин", "банан",
                "Лимон", "Лайм", "Персик", "Киви", "Лайм",
                "Киви", "Персик", "Киви", "Киви"
        );
        Set<String> unique = new HashSet<>(fruits);
        System.out.println("Введенный список:");
        System.out.println(fruits);
        System.out.println();
        System.out.println("Уникальные наименования:");
        System.out.println(unique);
        System.out.println();
        System.out.println("Повторяющиеся слова:");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(fruits, key));
        }
    }
}
