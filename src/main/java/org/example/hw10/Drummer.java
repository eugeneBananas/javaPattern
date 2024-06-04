package org.example.hw10;

import org.springframework.stereotype.Component;

@Component(value = "drummer")
public class Drummer implements Musician {
    @Override
    public void doCoding() {
        System.out.println("druuuum");
    }
}
