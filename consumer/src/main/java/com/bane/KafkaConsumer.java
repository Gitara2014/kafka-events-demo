package com.bane;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "timestampTopic", containerFactory = "kafkaListenerContainerFactory")
    void listener(TimestampEvent timestampEvent) {
        log.info("Time is: {}", timestampEvent.getZonedDateTime());
    }
}
