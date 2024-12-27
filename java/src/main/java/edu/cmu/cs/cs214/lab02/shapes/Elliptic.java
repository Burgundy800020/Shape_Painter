package edu.cmu.cs.cs214.lab02.shapes;

import java.awt.Graphics2D;

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

    public boolean draw(Graphics2D g2d, int x, int y){
        g2d.drawOval(x, y, getHor(), getVer());
        return true;
    }
}
