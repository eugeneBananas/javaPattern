package org.example.hw6.AbstractFactory;

public class MireaFactory implements WorkerFactory{
    @Override
    public Cook createCook() {
        return new UniversityCook();
    }

    @Override
    public Proger creatProger() {
        return new JavaProger();
    }
}
