package org.example.hw10;

import org.springframework.stereotype.Component;

@Component
public class Trombonist implements Musician {
    @Override
    public void doCoding() {
        System.out.println("trom-trom-trooooooom");
    }
}
