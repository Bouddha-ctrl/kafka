package com.example.demo.receiver;

import com.example.demo.dto.Log;

public interface IReceiver {
    public void listen(String topicName, String log);

}
