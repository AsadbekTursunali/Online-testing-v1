package models;

import java.util.Objects;

public class User {
    private static final Long ID = (long) ((Math.random() * 9999) + 1);
    private String name;
    private String surname;
    private Integer age;
    private String usernameOrEmail;
    private String password;
    private String role;

    public User(String name, String surname, Integer age, String usernameOrEmail, String password, String role) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.usernameOrEmail = usernameOrEmail;
        this.password = password;
        this.role = role;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsernameOrEmail() {
        return usernameOrEmail;
    }

    public void setUsernameOrEmail(String usernameOrEmail) {
        this.usernameOrEmail = usernameOrEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", usernameOrEmail='" + usernameOrEmail + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
