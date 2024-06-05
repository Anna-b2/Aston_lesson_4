package Lesson_8_PhoneBook;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        List<String> numbers = phoneBook.get(lastName);
        if (numbers == null) {
            numbers = new ArrayList<>();
        }
        numbers.add(phoneNumber);
        phoneBook.put(lastName, numbers);
    }

    public List<String> get(String lastName) {
        List<String> numbers = phoneBook.get(lastName);
        if (numbers == null) {
            numbers = new ArrayList<>();
        }
        return numbers;
    }
}
