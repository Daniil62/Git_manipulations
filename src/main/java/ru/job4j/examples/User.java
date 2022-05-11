package ru.job4j.examples;

import java.time.LocalDate;

public class User implements Comparable<User> {

    private final String lastName;
    private final String name;
    private final String patronymic;
    private final LocalDate birthday;
    private String info;

    public User(String lastName, String name, String patronymic, LocalDate birthday) {
            this.lastName = lastName;
            this.name = name;
            this.patronymic = patronymic;
            this.birthday = birthday;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "lastName: " + lastName + System.lineSeparator()
                + "name: " + name + System.lineSeparator()
                + "patronymic: " + patronymic + System.lineSeparator()
                + "birthday: " + birthday.toString() + System.lineSeparator()
                + "info: " + info + System.lineSeparator();
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result *= 31 + lastName.hashCode();
        result *= 31 + patronymic.hashCode();
        result *= 31 + birthday.hashCode();
        result *= 31 + info.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) {
            return false;
        }
        return name.equals(((User) obj).name)
                && lastName.equals(((User) obj).lastName)
                && patronymic.equals(((User) obj).patronymic)
                && birthday.equals(((User) obj).birthday)
                && info.equals(((User) obj).info);
    }

    @Override
    public int compareTo(User o) {
        int result;
        result = lastName.compareTo(o.lastName);
        if (result == 0) {
            result = name.compareTo(o.name);
            if (result == 0) {
                result = patronymic.compareTo(o.patronymic);
                if (result == 0) {
                    result = birthday.toString().compareTo(o.birthday.toString());
                }
            }
        }
        return result;
    }
}
