package org.example.hw6.Builder;

public class Main {
    public static void main(String[] args) {
        CarBuilder classicCarBuilder = new ClassicCarBuilder();
        AutomotiveEngineer automotiveEngineer = new AutomotiveEngineer(classicCarBuilder);
        Car car = automotiveEngineer.manufactureCar();
    }
}
