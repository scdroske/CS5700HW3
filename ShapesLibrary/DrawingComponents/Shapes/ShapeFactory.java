package Shapes;


import java.util.ArrayList;
import java.util.List;

public abstract class ShapeFactory {
    List composite = new ArrayList();

    public void addShape(Shape shape){
        throw new UnsupportedOperationException();
    }

    public void removeShape(Shape shape){
        throw new UnsupportedOperationException();
    }

    public ShapeFactory getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getShape(){
        throw new UnsupportedOperationException();
    }

    public Point getLocation(){
        throw new UnsupportedOperationException();
    }

    public double getArea(){
        throw new UnsupportedOperationException();
    }

    public void generateShape(){
        throw new UnsupportedOperationException();
    }
}