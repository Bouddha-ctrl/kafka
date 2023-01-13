package com.example.demo.sender;

import com.example.demo.dto.Log;

public interface ISender {
    void send(String topicName, Log log);
}
