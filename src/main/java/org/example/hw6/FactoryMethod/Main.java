package org.example.hw6.FactoryMethod;

public class Main {

    public static void main(String[] args) {
        WorkerFactory cookFactory = new CookFactory();
        WorkerFactory progerFactory = new ProgerFactory();

        Worker cook = cookFactory.createWorker();
        Worker proger = progerFactory.createWorker();

        cook.work();
        proger.work();
    }

}
