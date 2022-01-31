package com.bane;

import lombok.AllArgsConstructor;

import java.time.ZonedDateTime;

@AllArgsConstructor
public class TimestampEvent {
    private ZonedDateTime zonedDateTime;

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }
}
