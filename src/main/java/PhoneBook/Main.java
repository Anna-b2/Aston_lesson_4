package PhoneBook;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook1 = new PhoneBook();
        phoneBook1.add("Иванов", "292859037");
        phoneBook1.add("Иванов", "297867777");
        phoneBook1.add("Петров", "331212122");
        phoneBook1.add("Малышев", "442345345");

        List<String> numbers1 = phoneBook1.get("Иванов");
        List<String> numbers2 = phoneBook1.get("Петров");
        List<String> numbers3 = phoneBook1.get("Малышев");

        System.out.println("Номера телефонов для фамилии Иванов:");
        for (String number : numbers1) {
            System.out.println(number);
        }
        System.out.println();
        System.out.println("Номера телефонов для фамилии Петров:);
        for (String number : numbers2) {
            System.out.println(number);
        }
        System.out.println();
        System.out.println("Номера телефонов для фамилии Малышев:");
        for (String number : numbers3) {
            System.out.println(number);
        }
    }
}
