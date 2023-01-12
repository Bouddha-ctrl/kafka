package sender.implementation;

import dto.Log;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import sender.ISender;

@Service
public class KafkaSender implements ISender {

    @Autowired
    private KafkaTemplate<String, Log> kafkaTemplate;

    /**
     * Permet d'envoyer un message (Log) dans un topic
     *
     * @param topicName
     *                      Nom du topic
     * @param log
     *                      Objet à envoyer
     */
    @Override
    public void send(String topicName, Log log) {
        System.out.println("Message à envoyer : topicName="+topicName +", Log=" + log);
        new NewTopic(topicName, 1, (short) 1);
        kafkaTemplate.send(topicName, log);
    }
}
