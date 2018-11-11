package com.tictactoe.server.message;
import com.google.gson.Gson;

/*
@author : Monireh Vahdati 
vahdati.monireh@gmail.com
    */

/**
 * Base class of message beans
 *
 */

public class MessageBean {
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
