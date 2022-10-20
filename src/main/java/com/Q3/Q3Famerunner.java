package com.Q3;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Q3Famerunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app =
                new AnnotationConfigApplicationContext(Q3Famerunner.class);
        GameRunner obj = app.getBean(GameRunner.class);
        obj.play();
    }

}
