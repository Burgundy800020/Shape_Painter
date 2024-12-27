package edu.cmu.cs.cs214.lab02.shapes;

import java.awt.Graphics2D;

public class Rectangular implements Shape_t {
    private int height;
    private int width;
    
    public Rectangular(int width, int height){
        this.height = height;
        this.width = width;
    }

    public ShapeType getType(){
        return ShapeType.RECTANGLE;
    }

    public double getArea() {
        return height * width;
    }

    public int getHor(){
        return this.width;
    }

    public int getVer(){
        return this.height;
    }

    public boolean draw(Graphics2D g2d, int x, int y){
        g2d.drawRect(x, y, getHor(), getVer());
        return true;
    }
}
