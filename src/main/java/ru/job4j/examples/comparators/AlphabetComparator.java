package ru.job4j.examples.comparators;

import ru.job4j.examples.User;

import java.util.Comparator;

public class AlphabetComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        int result = o1.getLastName().compareTo(o2.getLastName());
        if (result == 0) {
            result = o1.getName().compareTo(o2.getName());
            if (result == 0) {
                result = o1.getPatronymic().compareTo(o2.getPatronymic());
                if (result == 0) {
                    result = o1.getBirthday().toString().compareTo(o2.getBirthday().toString());
                }
            }
        }
        return result;
    }
}
