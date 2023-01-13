package com.example.demo.receiver.implementation;

import com.example.demo.dto.Log;
import com.example.demo.receiver.IProcess;
import com.example.demo.sender.ISender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProcessExample implements IProcess {

    @Autowired
    private ISender sender;
    List<Log> logs = new ArrayList<Log>();
    /**
     * Exécuter le traitement
     * @param topicName
     *              Nom du Topic
     * @param log
     *              objet person
     */
    @Override
    public void execute(String topicName, Log log) {
        logs.add(log);
        sender.send("output",log);
        System.out.println("Message reçu: topicName="+topicName +", log=" + log);
    }
}
