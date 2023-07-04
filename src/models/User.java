package models;

public class User {
    private static final Long ID = (long) ((Math.random() * 9999) + 1);
    private String username;
    private Integer age;
    private String email;
    private String password;
    private String role;

    public User(String username, Integer age, String email, String password, String role) {
        this.username = username;
        this.age = age;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
                "username='" + username + '\'' +
                ", age=" + age +
                ", Email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
