package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape_t;
import edu.cmu.cs.cs214.lab02.shapes.Rectangular;

public class Main {
    public static void main(String[] args) {
        Shape_t rectangle = new Rectangular(2, 3);

        Renderer renderer = new Renderer(rectangle);

        renderer.draw();
    }
}
