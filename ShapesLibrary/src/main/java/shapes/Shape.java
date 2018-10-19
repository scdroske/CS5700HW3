package shapes;

public interface Shape {
    public void add(Shape newShape){
        throw new UnsupportedOperationException();

    }


    public void remove(Shape newShape){
        throw new UnsupportedOperationException();

    }

    public Shape getComponent(int componentIndex){
        throw new UnsupportedOperationException();

    }

    public String getShapeName(){
        throw new UnsupportedOperationException();

    }

    


    public Point getOriginPoint(Point point);

    public double getArea(double length, double height);

    public double moveShape(Point point);

}
