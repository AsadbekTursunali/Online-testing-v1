package repositories;

public interface UserRepository {
    void save();
    void add(String username, Integer age, String email, String password, String role);
}
