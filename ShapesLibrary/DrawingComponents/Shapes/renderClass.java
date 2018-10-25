package Shapes;

import javax.swing.JFrame;
import java.awt.*;
import java.io.IOException;

public class renderClass {

    public static void main(String[] args) throws ShapeException {
        Point point1 = new Point(1, 3);
        ShapeFactory rectangle = new CompositeShape("Rectangle", point1);
        Point point2 = new Point(3, 5);
        ShapeFactory ellipse = new CompositeShape("Ellipse", point2);
        Point point3 = new Point(4, 4);
        ShapeFactory circle = new CompositeShape("Circle", point3);
        Point point4 = new Point(1, 1);
        ShapeFactory square = new CompositeShape("Square", point4);
        Point point5 = new Point(0, 0);

        ShapeFactory compositeShape = new CompositeShape("Composite", point5);


        compositeShape.addShape(rectangle);
        //compositeShape.addShape(rectangle);
        compositeShape.addShape(ellipse);
        //compositeShape.addShape(rectangle);
        compositeShape.addShape(ellipse);
        compositeShape.addShape(circle);
        compositeShape.addShape(square);

        rectangle.addShape(new Shapes("Rectangle", point1, false, 14));
        ellipse.addShape(new Shapes("Ellipse", point2,false,24));
        compositeShape.addShape(square);


        ShapeCreator shapeCreator = new ShapeCreator(compositeShape);
        shapeCreator.printShapes();
    }
}
        //opening file to read scripts
        //ReadFile read = new ReadFile();
        //read.openFile();
        //read.readFile();
        //read.closeFile();

        //setting the stage
        //JFrame window = new JFrame();
        //window.setSize(640, 480);
        //window.setTitle("Shapes");
        //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //window.setVisible(true);

        //DrawingComponent drawingComponent = new DrawingComponent();

        //this is where the for loop to run through each component will be
        //Shapes shapes = new Shapes();
        //window.add(drawingComponent);
        //read.WriteFile();




//public void renderShapes(){



//}