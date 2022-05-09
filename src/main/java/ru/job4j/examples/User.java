package ru.job4j.examples;

public class User {

    private final String name;
    private final String lastName;
    private final String patronymic;
    private String info;

    public User(String name, String lastName, String patronymic) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
