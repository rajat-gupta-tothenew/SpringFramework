package com.Q3;

import org.springframework.stereotype.Component;

@Component
class PacmanGame implements GameInterface{
    public void run() {
        System.out.println("pacman game Tightly Coupled");
    }
}
