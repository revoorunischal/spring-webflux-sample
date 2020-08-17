package com.finacle.testReceiverFlux;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Bean {
    private String name;
    public Bean(){
        name = "test";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
