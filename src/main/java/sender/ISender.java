package sender;

import dto.Log;

public interface ISender {
    void send(String topicName, Log log);
}
