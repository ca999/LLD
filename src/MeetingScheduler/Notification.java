package MeetingScheduler;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Notification {
    private String id;
    String content;
    Date creationDate;

    public Notification(String content, Date creationDate) {
        this.id = UUID.randomUUID().toString();
        this.creationDate = creationDate;
        this.content = content;
    }

    void sendNotification(User users) {
        System.out.println("Notification sent to " + users.name + " users");
    }


}
