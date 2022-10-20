package com.Q4;

import org.springframework.stereotype.Component;

@Component
class PacmanGame implements GameInterface {
    public void run() {
        System.out.println("pacman game");
    }
}
