package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired // Field Injection
    @Qualifier("desktop")
    private Computer comp;

//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }

/*    @Autowired                // Setter Injection
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }*/

    public void build() {
        comp.compile();
        comp.debug();
        System.out.println("Working on Awesome Project");
    }
}
