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
    List<String> logs = new ArrayList<String>();
    /**
     * Exécuter le traitement
     * @param topicName
     *              Nom du Topic
     * @param log
     *              objet log
     */
    @Override
    public void execute(String topicName, String log) {

        logs.add(log);

        sender.send("output","Preceded : "+log);
    }
}
