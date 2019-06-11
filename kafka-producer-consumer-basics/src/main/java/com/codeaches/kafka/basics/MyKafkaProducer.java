package com.codeaches.kafka.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyKafkaProducer {

	private final Logger log = LoggerFactory.getLogger(MyKafkaProducer.class);

	@Autowired
	private KafkaTemplate<Object, Object> template;

	@PostMapping(path = "/send/{what}")
	public void sendFoo(@PathVariable String what) {

		this.template.send("topic2", what);
	}
}
