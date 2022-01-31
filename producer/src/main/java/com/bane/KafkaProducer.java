package com.bane;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

@Log4j2
@Component
public class KafkaProducer {

    private final KafkaTemplate<String, TimestampEvent> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, TimestampEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Scheduled(fixedRate = 10000L)
    public void whatIsCurrentTime() {
        var event = new TimestampEvent(ZonedDateTime.now());
        kafkaTemplate.send("timestampTopic", event);
        log.info("Sent {}", event.getZonedDateTime());
    }


}
