package com.example.demo.receiver.implementation;

import com.example.demo.dto.Log;
import com.example.demo.receiver.IProcess;
import com.example.demo.receiver.IReceiver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaReceiver implements IReceiver {

    @Autowired
    private IProcess process;  // Affectation de l'instance pour la gestion des traitements

    @KafkaListener(topics = "Tuto1",containerFactory="kafkaListenerContainerFactory")
    public void listenTuto1(String log) {
        listen("Tuto1",log);
    }

    @KafkaListener(topics = "Tuto2",containerFactory="kafkaListenerContainerFactory")
    public void listenTuto2(String log) {
        listen("Tuto2",log);
    }

    @Override
    public void listen(String topicName, String log) {
        System.out.println("Topic :"+topicName+", Message reçu :"+log);
        process.execute(topicName, log);
    }
}
