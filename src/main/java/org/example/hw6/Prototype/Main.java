package org.example.hw6.Prototype;

public class Main {
    public static void main(String[] args) {
        Shape circlePrototype = new Circle("red");

        ShapeClient client = new ShapeClient(circlePrototype);

        Shape redCircle = client.createShape();

        redCircle.draw();
    }
}
