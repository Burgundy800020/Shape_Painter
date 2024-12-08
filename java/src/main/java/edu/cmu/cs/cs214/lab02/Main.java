package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);

        Renderer renderer = new Renderer(rectangle);

        renderer.draw();
    }
}
