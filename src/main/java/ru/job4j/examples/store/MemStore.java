package ru.job4j.examples.store;

import ru.job4j.examples.User;

import java.util.ArrayList;
import java.util.List;

public class MemStore implements Store {

    private List<User> users = new ArrayList<>();

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public User get(int id) {
        User result = null;
        if (id >= 0 && id < users.size()) {
            result = users.get(id);
        }
        return result;
    }

    @Override
    public User delete(int id) {
        User result = null;
        if (id >= 0 && id < users.size()) {
            result = users.remove(id);
        }
        return result;
    }
}
