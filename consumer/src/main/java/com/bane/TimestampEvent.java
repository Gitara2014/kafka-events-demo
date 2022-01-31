package com.bane;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;

public class TimestampEvent {

    private final ZonedDateTime zonedDateTime;

    public TimestampEvent(@JsonProperty("zonedDateTime") ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }
}
