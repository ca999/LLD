package MeetingScheduler;

import java.time.LocalDateTime;
import java.util.Date;

public class Interval {

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    Interval(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;

    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }
}
