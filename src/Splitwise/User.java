package Splitwise;

import java.util.UUID;

public class User {
    private String name;
    private String email;
    private String userId;
    User(String name, String email) {
        this.name = name;
        this.email = email;
        this.userId = UUID.randomUUID().toString();

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


}
