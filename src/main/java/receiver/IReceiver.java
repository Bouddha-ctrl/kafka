package receiver;

import dto.Log;

public interface IReceiver {
    public void listen(String topicName, Log log);

}
