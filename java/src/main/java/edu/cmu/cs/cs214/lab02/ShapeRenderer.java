import java.lang.Override;
import java.util.Scanner;
import java.util.ArrayList;
import edu.cmu.cs.cs214.lab02.shapes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.Shape;

public class ShapeRenderer extends JPanel {
    private int x = 10;
    private int y = 10;
    private List<Shape> shapes = new ArrayList<Shape>();
    private List<Shape> storedShapes = new ArrayList<Shape>();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set color
        g2d.setColor(Color.BLUE);

        for(int i=0;i<shapes.size();i++){
            Shape shape = shapes.get(i);
            switch (shape.getType()) {
                case ShapeType.RECTANGLE:
                    g2d.drawRect(x, y, shape.getHor(), shape.getVer());
                    break;
                case ShapeType.ELLIPSE:
                    g2d.drawOval(x, y, shape.getHor(), shape.getVer());
                    break;
                default:
                    System.err.println ("Unknown shape type");
                    break;
            }
            x += shape.getHor() + 10;
            if(x > getWidth()){
                x = 10;
                y += 200;
            }
        }
    }

    public void addShape(String name, int hor, int vert){
        Shape S;
        if(name.equals("rectangle")){
            S = Rectangular(hor, vert);
        }
        else if(name.equals("ellipse")){
            S = Elliptic(hor, vert);
        }
        else{
            System.out.println("Unknown shape");
            return;
        }
        storedShapes.add(S);
    }

    public void paintShape(int i){
        if(i < 0 || i >= storedShapes.size()){
            System.out.println("Out-of-bound index");
            return;
        }
        shapes.add(storedShapes.get(i));
        repaint();  
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Renderer");
        ShapeRenderer shapes = new ShapeRenderer();

        frame.add(shapes);
        frame.setSize(800, 800);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
   
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a shape: ");
        String name = scanner.nextLine();
        
        while(!name.equals("exit")){
            shapes.addShape(name, 20, 20);
            shapes.paintShape(0);
            System.out.println("Enter a shape: ");
            name = scanner.nextLine();
        }
        scanner.close();
    }
}