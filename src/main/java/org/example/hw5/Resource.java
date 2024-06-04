package org.example.hw5;

public class Resource {
    private static final Resource instance = new Resource();

    private Resource() {
    }

    public static Resource getInstance() {
        return instance;
    }
}
