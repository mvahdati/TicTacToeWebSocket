package com.tictactoe.server.message;

/*
@author : Monireh Vahdati 
vahdati.monireh@gmail.com
    */


/**
 * Represents a message of Tic Tac Toe turn
 *
 */

public class TurnMessageBean extends MessageBean {
    public enum Turn {
        WAITING, YOUR_TURN
    }

    private final String type = "turn";
    private Turn turn;

    public TurnMessageBean(Turn t) {
        turn = t;
    }

    public String getType() {
        return type;
    }

    public Turn getTurn() {
        return turn;
    }
}
