package PhoneBook;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook1 = new PhoneBook();

        phoneBook1.add("Dad", "1111111");
        phoneBook1.add("Dad", "2222222");
        phoneBook1.add("Mom", "3333333");
        phoneBook1.add("Sister", "4444444");

        List<String> numbers1 = phoneBook1.get("Dad");
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
