package mano.labs.kafka.consumer.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import mano.labs.kafka.consumer.models.User;

@Service
public class JsonMessageListener {
	
	@KafkaListener(topics="JsonMessageKafkaExample", groupId="consumer_group", containerFactory="kafkaListerContainerFactory4Json")
	public void consume(User user){
		System.out.println("Recieved Json Message: " + user);
	}
	
}
