package org.example.hw6.AbstractFactory;

public class Main {

    public static void main(String[] args) {
        MireaFactory mireaFactory = new MireaFactory();

        Cook universityCook = mireaFactory.createCook();
        Proger javaProger = mireaFactory.creatProger();

        universityCook.work();
        javaProger.work();
    }
}
