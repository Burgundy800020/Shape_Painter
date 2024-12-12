package edu.cmu.cs.cs214.lab02.shapes;

public interface Shape_t {
    public enum ShapeType {
        UNKNOWN,RECTANGLE, ELLIPSE;
    } 
    public double getArea(); 
    public ShapeType getType();
    public int getHor();
    public int getVer();  
}