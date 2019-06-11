package com.codeaches.kafka.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyKafkaConsumer {

	private final Logger log = LoggerFactory.getLogger(MyKafkaProducer.class);

	@KafkaListener(id = "group1", topics = "topic2")
	public void listen(String foo) {
		log.info("Received: " + foo);
	}
}
