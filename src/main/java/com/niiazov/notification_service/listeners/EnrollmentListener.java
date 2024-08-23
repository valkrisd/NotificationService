package com.niiazov.notification_service.listeners;

import com.niiazov.notification_service.dto.EnrollmentDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EnrollmentListener {

    @KafkaListener(
            containerFactory = "kafkaListenerContainerFactory",
            topics = "${spring.kafka.topic.name}")

    public void listen(EnrollmentDTO message) {
        log.info(String.format("#### -> Consumed message -> %s", message.toString()));
    }
}
