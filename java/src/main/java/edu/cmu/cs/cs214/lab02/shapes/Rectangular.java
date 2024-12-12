package edu.cmu.cs.cs214.lab02.shapes;

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
}
