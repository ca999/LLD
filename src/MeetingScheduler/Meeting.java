package MeetingScheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Meeting {
    private MeetingRoom meetingRoom;
    private List<User> users;
    private String meetingId;
    private Interval time;


    Meeting(MeetingRoom meetingRoom, Interval time, List<User> users) {
        this.meetingRoom = meetingRoom;
        this.time = time;
        this.users = users;
        this.meetingId = UUID.randomUUID().toString();
    }

    void addUser(User user) {
        this.users.add(user);
    }

    void removeUser(User user) {
        this.users.remove(user);
    }
}
