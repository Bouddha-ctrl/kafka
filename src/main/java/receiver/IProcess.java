package receiver;

import dto.Log;

public interface IProcess {
    public void execute(String info, Log log);
}
