package edu.cmu.cs.cs214.lab02.shapes;

enum ShapeType {
    UNKNOWN,RECTANGLE, ELLIPSE;
}

public interface Shape {
    public double getArea(); 
    public ShapeType getType();
    public int getHor();
    public int getVer();  
}