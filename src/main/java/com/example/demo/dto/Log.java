package com.example.demo.dto;

public class Log {

    private String date;
    private String code;
    private String protocol;
    private String website;
    private String path;

    public Log(){

    }

    public Log(String date,String code,String protocol, String website, String path){
        this.protocol = protocol;
        this.date = date;
        this.code = code;
        this.website = website;
        this.path = path;
    }
    public String getCode() {
        return code;
    }

    public String getDate() {
        return date;
    }

    public String getPath() {
        return path;
    }

    public String getWebsite() {
        return website;
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

    public void setPath(String path) {
        this.path = path;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setProtocole(String protocole) {
        this.protocol = protocole;
    }

    @Override
    public String toString() {
        return "{Date :"+date+", Protocole :"+protocol+", siteweb :"+website+", Path:"+path+", Code :"+code+"}";
    }
}
