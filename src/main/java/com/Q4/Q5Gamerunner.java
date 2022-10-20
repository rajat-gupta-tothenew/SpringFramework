package com.Q4;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Q5Gamerunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app =
                new AnnotationConfigApplicationContext(Q5Gamerunner.class);
        GameRunner obj = app.getBean(GameRunner.class);
        obj.play();
    }

}
