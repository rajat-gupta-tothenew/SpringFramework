package com.Q5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
class RcGame implements GameInterface {
    public void run() {

        System.out.println("RC game Tightly Coupled");
    }
}
