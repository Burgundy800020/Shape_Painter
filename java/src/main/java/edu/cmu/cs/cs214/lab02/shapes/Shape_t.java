package edu.cmu.cs.cs214.lab02.shapes;

import java.awt.Graphics2D;

public interface Shape_t {
    public enum ShapeType {
        UNKNOWN,RECTANGLE, ELLIPSE;
    } 
    public double getArea(); 
    public ShapeType getType();
    public int getHor();
    public int getVer();  
    public boolean draw(Graphics2D g2d, int x, int y);
}