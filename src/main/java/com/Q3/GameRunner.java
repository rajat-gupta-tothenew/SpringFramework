package com.Q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    @Autowired
    private GameInterface gameinterface;
    public GameRunner(GameInterface game) {
        gameinterface = game;
    }
    public void play(){
        gameinterface.run();
    }
}
