package dto;

public class Log {

    private String date;
    private String code;
    private String protocol;
    private String message;

    public Log(){

    }

    public Log(String date,String code,String protocol){
        this.protocol = protocol;
        this.date = date;
        this.code = code;
    }
    public String getCode() {
        return code;
    }

    public String getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public String getProtocole() {
        return protocol;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setProtocole(String protocole) {
        this.protocol = protocole;
    }

    @Override
    public String toString() {
        return "{Date :"+date+", Protocole :"+protocol+", Code"+code+"}";
    }
}
