package MeetingScheduler;

import java.util.ArrayList;
import java.util.List;

public class Calender {
    private List<Meeting> meetings;
    public Calender() {
        meetings = new ArrayList<Meeting>();
    }

    void addMeeting(Meeting meeting) {
        meetings.add(meeting);
    }

    void removeMeeting(Meeting meeting) {
        meetings.remove(meeting);
    }

    List<Meeting> getMeetings() {
        return meetings;
    }
}
