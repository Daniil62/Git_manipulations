package ru.job4j.examples.store;

import ru.job4j.examples.User;

public interface Store {

    void add(User user);

    User get(int id);

    User delete(int id);
}
