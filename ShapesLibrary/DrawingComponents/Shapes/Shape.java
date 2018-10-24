package Shapes;


public interface Shape {

    public Point getOriginPoint(int x, int y);

    public double getArea(int length, int height);

    public double moveShape(int dx, int dy);

}
