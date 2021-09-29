package com.github.tillias.spbka;

import com.github.tillias.spbka.schema.avro.Event2;
import com.github.tillias.spbka.utils.Topic;
import io.apicurio.registry.client.request.RequestHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.github.tillias.spbka.schema.avro.Event;

import java.time.Instant;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class Producer {

    private final KafkaTemplate<String, Event> kafkaTemplate;
    private final KafkaTemplate<String, Event2> kafkaTemplate2;



    public void send(Event payload) {
        log.info("Producer sending message {} to topic {}", payload, Topic.NAME);
        this.kafkaTemplate.send(Topic.NAME, payload);
    }


    @EventListener(ApplicationReadyEvent.class)
    public void me2() {
        log.info("Coming22222222 inside Producer#me() method ....");
        final Event2 event = new Event2();
        this.kafkaTemplate2.send(Topic.NAME, event);
    }


    public void me() {
        log.info("Coming inside Producer#me() method ....");
        final Event event = new Event();
        event.setName(UUID.randomUUID().toString());
        event.setDescription("test description");
        event.setCreatedOn(30);
        event.setF1(1);
        event.setF2(2);
        event.setF3(25);
        this.kafkaTemplate.send(Topic.NAME, event);
    }

}