package com.Q6;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Q6Gamerunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app =
                new AnnotationConfigApplicationContext(Q6Gamerunner.class);
        GameRunner obj = app.getBean(GameRunner.class);
        obj.play();
    }

}
