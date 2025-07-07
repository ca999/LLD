package Splitwise;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Group {
    String name;
    String groupId;
    List<User> members;
    Date createdAt;

    public Group(String name, List<User> members) {
        this.groupId = UUID.randomUUID().toString();
        this.name = name;
        this.members = members;
        this.createdAt = new Date();
    }

    public String getGroupId() {
        return groupId;
    }

    public String getName() {
        return name;
    }

}
