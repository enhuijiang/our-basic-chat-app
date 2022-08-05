package com.udacity.jwdnd.c1.review.model;

import com.udacity.jwdnd.c1.review.model.ChatForm;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class ChatMessages {
    private String username;
    private String message;

    public String getUsername(){
        return username;
    }
    public String getMessage(){
        return message;
    }

    public void setUsername(String username){
        this.username=username;
    }
    public void setMessage(String message){
        this.message=message;
    }


}
