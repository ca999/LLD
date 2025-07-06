package MeetingScheduler;

import java.util.List;

public class MeetingScheduler {

    private User organizer;
    private Calender calendar;
    List<MeetingRoom> rooms;

    public MeetingScheduler(User organizer, List<MeetingRoom> rooms) {
        this.organizer = organizer;
        this.calendar = new Calender();
        this.rooms = rooms;
    }

    public boolean schedule(List<User> participants, Interval interval) {
        boolean found = false;
        MeetingRoom availableRoom = null;
        for(MeetingRoom room : rooms) {
            if(room.isAvailable(interval) && room.hasCapacity(participants.size())) {
                found = true;
                availableRoom = room;
                break;
            }
        }

        if(!found) {
            return false;
        }

        Meeting meeting = new Meeting(availableRoom, interval, participants);
        calendar.addMeeting(meeting);
        return false;

    }

}
