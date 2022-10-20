package com.Q4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    @Autowired
    private GameInterface gameinterface;
    //public GameRunner(GameInterface game) {
        //gameinterface = game;
   //

    public void setGameinterface(GameInterface gameinterface) {
        this.gameinterface = gameinterface;
    }

    public void play(){
        gameinterface.run();
    }
}
