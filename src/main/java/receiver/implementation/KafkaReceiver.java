package receiver.implementation;

import dto.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import receiver.IProcess;
import receiver.IReceiver;

@Service
public class KafkaReceiver implements IReceiver {

    @Autowired
    private IProcess process;  // Affectation de l'instance pour la gestion des traitements

    /**
     * Ecoute sur le topic "Tuto1", s'il existe un message
     *
     * @param log
     *              Objet reçu
     */
    @KafkaListener(topics = "Tuto1",containerFactory="kafkaListenerContainerFactory")
    public void listenTuto1(Log log) {
        listen("Tuto1",log);
    }

    /**
     * Ecoute sur le topic "Tuto2", s'il existe un message

     * @param log
     *              Objet reçu
     */
    @KafkaListener(topics = "Tuto2",containerFactory="kafkaListenerContainerFactory")
    public void listenTuto2(Log log) {
        listen("Tuto2",log);
    }

    @Override
    public void listen(String topicName, Log log) {
        process.execute(topicName, log);
    }
}
