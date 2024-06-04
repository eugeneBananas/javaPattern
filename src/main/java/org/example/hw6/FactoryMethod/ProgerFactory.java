package org.example.hw6.FactoryMethod;

class ProgerFactory implements WorkerFactory {
    @Override
    public Worker createWorker() {
        return new Proger();
    }
}