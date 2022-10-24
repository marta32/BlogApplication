package com.springboot.blog.payload;

import java.util.Date;

public class ErrorDetailis {
    private Date timestamp;
    private String message;
    private String detailis;

    public ErrorDetailis(Date timestamp, String message, String detailis) {
        this.timestamp = timestamp;
        this.message = message;
        this.detailis = detailis;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetailis() {
        return detailis;
    }
}
