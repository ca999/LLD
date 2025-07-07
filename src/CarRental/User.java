package CarRental;

import java.util.UUID;

public class User {
    String name;
    String email;
    private final String userId;

    public User(String name, String email) {
        this.name = name;
        this.userId = UUID.randomUUID().toString();
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getUserId() {
        return userId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
