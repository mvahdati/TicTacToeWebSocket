package com.tictactoe.server.message;


/*
@author : Monireh Vahdati 
vahdati.monireh@gmail.com
    */

/**
 * Represents handshake message
 *
 */

public class HandshakeMessageBean extends MessageBean {

    private final String type = "handshake";
    private int gameId;
    private String player;

    public HandshakeMessageBean(int gameId, String player) {
        this.gameId = gameId;
        this.player = player;
    }

    public String getType() {
        return type;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

}
