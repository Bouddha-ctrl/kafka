package com.example.demo.sender.implementation;

import com.example.demo.dto.Log;
import com.example.demo.sender.ISender;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender implements ISender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    /**
     * Permet d'envoyer un message (Log) dans un topic
     *
     * @param topicName
     *                      Nom du topic
     * @param log
     *                      Objet à envoyer
     */
    @Override
    public void send(String topicName, String log) {
        new NewTopic(topicName, 1, (short) 1);
        kafkaTemplate.send(topicName, log);
    }
}
