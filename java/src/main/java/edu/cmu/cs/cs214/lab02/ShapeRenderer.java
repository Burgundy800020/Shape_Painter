import java.lang.Override;
import java.util.Scanner;
import java.util.ArrayList;
import edu.cmu.cs.cs214.lab02.shapes.*;

import javax.swing.*;
import java.awt.*;

public class ShapeRenderer extends JPanel {
    private int x = 10;
    private int y = 10;
    private ArrayList<Shape_t> shapes = new ArrayList<Shape_t>();
    private ArrayList<Shape_t> storedShapes = new ArrayList<Shape_t>();
    
    private void checkIndex(int i){
        if(i < 0 || i >= storedShapes.size()){
            System.out.println("Out-of-bound index");
            return;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set color
        g2d.setColor(Color.BLUE);
        
        x = 10;
        y = 10;
        for(int i=0;i<shapes.size();i++){
            Shape_t shape = shapes.get(i);
            switch (shape.getType()) {
                case RECTANGLE:
                    g2d.drawRect(x, y, shape.getHor(), shape.getVer());
                    break;
                case ELLIPSE:
                    g2d.drawOval(x, y, 2*shape.getHor(), 2*shape.getVer());
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
        Shape_t S;
        if(name.equals("rectangle")){
            S = new Rectangular(hor, vert);
        }
        else if(name.equals("ellipse")){
            S = new Elliptic(hor, vert);
        }
        else{
            System.out.println("Unknown shape");
            return;
        }
        storedShapes.add(S);
    }

    public void paintShape(int i){
        checkIndex(i);
        shapes.add(storedShapes.get(i));
        repaint();  
    }

    public double getArea(int i){
        checkIndex(i);
        return storedShapes.get(i).getArea();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Renderer");
        ShapeRenderer shapes = new ShapeRenderer();

        frame.add(shapes);
        frame.setSize(800, 800);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
   
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a command (create/draw/area/exit):");
        String command = scanner.next();
        
        while(!command.equals("exit")){
            if(command.equals("create")){
                String name = scanner.next();
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                shapes.addShape(name, a, b);
            }
            else if(command.equals("draw")){
                int i = scanner.nextInt();
                shapes.paintShape(i);
            }
            else if(command.equals("area")){
                int i = scanner.nextInt();
                System.out.println(shapes.getArea(i));
            }
            else{
                System.out.println("Unknown command");
            }
            command = scanner.next();
        }
        scanner.close();
    }
}