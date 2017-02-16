package com.arichafamily.java;

import java.util.ArrayList;

/**
 * Created by Bosnia on 15/02/2017.
 */
public class BasketballTeam {
    private ArrayList<Player> basketballTeam = new ArrayList<>();

    public void addPlayer(Player p){
        basketballTeam.add(p);
    }

    public void addPlayer(){
        Player p = new Player();
        basketballTeam.add(p);
    }

    public void printAllPlayers(){
        for (Player p : basketballTeam){
            p.print();
        }
    }
}
