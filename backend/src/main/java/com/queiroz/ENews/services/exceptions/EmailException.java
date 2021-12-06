package com.queiroz.ENews.services.exceptions;

public class EmailException extends RuntimeException{

    public EmailException (String msg){
        super(msg);
    }
}
