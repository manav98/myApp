package com.telusko.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile() {
        System.out.println("Compiling but faster");
    }

    public void debug() {
        System.out.println("Debugging but faster");
    }
}
