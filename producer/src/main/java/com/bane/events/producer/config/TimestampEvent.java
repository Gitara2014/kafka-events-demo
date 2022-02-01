package com.bane.events.producer.config;

import lombok.AllArgsConstructor;

import java.time.ZonedDateTime;

@AllArgsConstructor
public class TimestampEvent {
    private ZonedDateTime zonedDateTime;

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }
}
