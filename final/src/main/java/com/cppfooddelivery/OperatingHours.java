package com.cppfooddelivery;
import java.sql.Time;
import java.util.*;

class OperatingHours {
    private Time start;
    private Time end;

    public OperatingHours(Time start, Time end) {
        this.start = start;
        this.end = end;
    }

    public boolean isWithinOperatingHours(Date time) {
        Time currentTime = new Time(time.getTime());
        return !currentTime.after(start) && !currentTime.before(end);
    }

    public Time getStart() {
        return start;
    }

    public Time getEnd() {
        return end;
    }
}
