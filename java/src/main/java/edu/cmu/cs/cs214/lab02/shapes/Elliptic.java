package edu.cmu.cs.cs214.lab02.shapes;

public class Elliptic implements Shape_t {
    private int radA;
    private int radB;

    public Elliptic(int radA, int radB) {
        this.radA = radA;
        this.radB = radB;
    }

    public ShapeType getType(){
        return ShapeType.ELLIPSE;
    }

    public double getArea() {
        return Math.PI * radA * radB;
    }

    public int getHor(){
        return this.radA;
    }

    public int getVer(){
        return this.radB;
    }
}
