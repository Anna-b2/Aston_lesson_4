package PhoneBook;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook1 = new PhoneBook();

        phoneBook1.add("Иванов", "292859037");
        phoneBook1.add("Иванов", "441223345");
        phoneBook1.add("Петров", "294567456");
        phoneBook1.add("Малышев", "331212122");

        List<String> numbers1 = phoneBook1.get("Иванов");
        List<String> numbers2 = phoneBook1.get("Mom");
        List<String> numbers3 = phoneBook1.get("Brother");

        System.out.println("Dad's phone numbers:");
        for (String number : numbers1) {
            System.out.println(number);
        }

        System.out.println();
        System.out.println("Mom's phone numbers:");
        for (String number : numbers2) {
            System.out.println(number);
        }

        System.out.println();
        System.out.println("Brother's phone numbers:");
        for (String number : numbers3) {
            System.out.println(number);
        }
    }
}
