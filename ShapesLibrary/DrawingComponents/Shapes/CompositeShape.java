package Shapes;

import java.util.ArrayList;
import java.util.Iterator;

public class CompositeShape extends ShapeFactory{
    ArrayList compositeShape = new ArrayList();
    String shape;
    Point location;

    public CompositeShape(String shape, Point location){
        this.shape = shape;
        this.location = location;
    }


    public void addShape(Shapes shape) {
        compositeShape.add(shape);
    }

    public void removeShape(Shape shape) {
        compositeShape.remove(shape);
    }


    public ShapeFactory getChild(int i) {
        return (ShapeFactory)compositeShape.get(i);
    }


    public String getShape() {
        return shape;
    }

    public Point getLocation(){
        return location;
    }


    public void generateShape() {
        System.out.println("\n" + getShape());
        System.out.println(", " + getLocation());
        System.out.println("-----------------");

        Iterator iterator = compositeShape.iterator();
        while (iterator.hasNext()){
            ShapeFactory shapeFactory = (ShapeFactory)iterator.next();
            shapeFactory.generateShape();
        }
    }
}

