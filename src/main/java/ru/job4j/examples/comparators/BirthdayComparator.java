package ru.job4j.examples.comparators;

import ru.job4j.examples.User;

import java.util.Comparator;

public class BirthdayComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.getBirthday().toString().compareTo(o2.getBirthday().toString());
    }
}
