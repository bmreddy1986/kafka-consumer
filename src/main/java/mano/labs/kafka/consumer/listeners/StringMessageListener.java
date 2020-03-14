package mano.labs.kafka.consumer.listeners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class StringMessageListener {
	
	@KafkaListener(topics="StringMessageKafkaExample", groupId="consumer_group")
	public void consume(String msg){
		System.out.println("Consumed String message: " + msg);
	}

}
