package com.arichafamily.java;

import java.util.Random;

/**
 * Created by Ron on 14/02/2017.
 */
public class Player {
    //properties:
    private String playerName;
    private int fieldShootPercent;
    private int gamePoint;

    //Constructors:
    public Player(String playerName, int fieldShootPercent, int gamePoint) {
        this.playerName = playerName;
        this.fieldShootPercent = fieldShootPercent;
        this.gamePoint = gamePoint;
    }

    public Player() {
        this.playerName = IO.getString("Enter player name: ");
        this.fieldShootPercent = IO.getInt("Enter field shooting percent: ");
        this.gamePoint = 0;
    }

    //Methods:
    public int shootForTwo(){
        Random rnd = new Random();
        int n = rnd.nextInt(100);
        if (n < fieldShootPercent){
            System.out.println("Shoot");
            gamePoint += 2;
        }
        else {
            System.out.println("Didn't shoot");
        }
        return gamePoint;
    }

    public void print(){
        System.out.printf("Player name: %s\nField shooting percent: %d\n", playerName, fieldShootPercent);
    }

    //getters and setters:
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getFieldShootPercent() {
        return fieldShootPercent;
    }

    public void setFieldShootPercent(int fieldShootPercent) {
        this.fieldShootPercent = fieldShootPercent;
    }

    public int getGamePoint() {
        return gamePoint;
    }

    public void setGamePoint(int gamePoint) {
        this.gamePoint = gamePoint;
    }
}
