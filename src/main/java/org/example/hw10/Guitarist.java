package org.example.hw10;

import org.springframework.stereotype.Component;

@Component
public class Guitarist implements Musician {
    @Override
    public void doCoding() {
        System.out.println("dringgggg!");
    }
}
