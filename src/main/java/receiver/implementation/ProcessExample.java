package receiver.implementation;

import dto.Log;
import receiver.IProcess;

public class ProcessExample implements IProcess {

    /**
     * Exécuter le traitement : Dans notre exemple affichage du message dans la console
     * @param topicName
     *              Nom du Topic
     * @param log
     *              objet person
     */
    @Override
    public void execute(String topicName, Log log) {
        System.out.println("Message reçu: topicName="+topicName +", person=" + log);
    }
}
