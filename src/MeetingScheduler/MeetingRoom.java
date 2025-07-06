package MeetingScheduler;

import java.time.LocalDateTime;
import java.util.*;

public class MeetingRoom {
    private String id;
    private String name;
    private int capacity;
    List<Interval> bookedIntervals;
    HashSet<Interval> availableIntervals;

    enum BookingStatus {
        BOOKED,
        NOT_BOOKED,
        CANCELLED
    };

    public MeetingRoom(String id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        bookedIntervals = new ArrayList<Interval>();
        availableIntervals = new HashSet<Interval>();
        LocalDateTime begin = LocalDateTime.now();
        LocalDateTime end = begin.plusHours(24);
        availableIntervals.add(new Interval(begin, end));

    }

    public BookingStatus bookInterval(Interval interval) {
        for(Interval i : availableIntervals) {
            if(interval.getStartTime().isAfter(i.getStartTime()) && interval.getEndTime().isBefore(i.getEndTime())) {
                bookedIntervals.add(interval);
                if(i.getStartTime().isEqual(interval.getStartTime()) && i.getEndTime().isEqual(interval.getEndTime())) {
                    availableIntervals.remove(i);
                    return BookingStatus.BOOKED;
                }
                availableIntervals.add(new Interval(i.getStartTime(), interval.getStartTime()));
                availableIntervals.add(new Interval(interval.getEndTime(), i.getEndTime()));
                return BookingStatus.BOOKED;
            }
        }
        return BookingStatus.NOT_BOOKED;
    }

    public BookingStatus cancelInterval(Interval interval) {

        bookedIntervals.remove(interval);
        Interval before = null;
        Interval after = null;

        for(Interval i : availableIntervals) {
            if(interval.getStartTime().isEqual(i.getEndTime())) {
                before = i;
            }

            if(interval.getEndTime().isEqual(i.getStartTime())) {
                after = i;
            }
        }

        if(Objects.nonNull(before) && Objects.nonNull(after)) {
            Interval merged = new Interval(before.getStartTime(), after.getEndTime());
            availableIntervals.add(merged);
            availableIntervals.remove(before);
            availableIntervals.remove(after);
        } else if(Objects.nonNull(before)) {
            Interval merged = new Interval(before.getStartTime(), interval.getEndTime());
            availableIntervals.add(merged);
            availableIntervals.remove(before);
        } else {
            Interval merged = new Interval(interval.getStartTime(), after.getEndTime());
            availableIntervals.add(merged);
            availableIntervals.remove(after);
        }


        return BookingStatus.CANCELLED;
    }

    public boolean isAvailable(Interval interval) {

        for(Interval i : availableIntervals) {
            if(interval.getStartTime().isAfter(i.getStartTime()) && interval.getEndTime().isBefore(i.getEndTime())) {

                return true;
            }
        }
        return false;
    }

    public boolean hasCapacity(int numberOfParticpants) {
        return capacity >= numberOfParticpants;
    }



}
