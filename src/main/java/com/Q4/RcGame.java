package com.Q4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


class RcGame implements GameInterface {
    public void run() {

        System.out.println("RC game");
    }
}
