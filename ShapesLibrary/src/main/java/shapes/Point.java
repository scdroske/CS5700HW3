package Shapes;


public class Point {
    private double x;
    private double y;

    public Point(double x, double y) throws ShapeException{
        Validator.validateDouble(x, "invalid x-location");
        Validator.validateDouble(y, "invalid y-location");
        this.x = x;
        this.y = y;
    }

    public double getX(){ return x; }

    public double getY(){ return y; }

    public void moveX(double deltaX) throws ShapeException{
        Validator.validateDouble(deltaX,"invalid deltaX location");
        x += deltaX;
    }

    public void moveY(double deltaY) throws ShapeException{
        Validator.validateDouble(deltaY, "invalid deltaY location");
        y+= deltaY;
    }

    public void move(double deltaX, double deltaY) throws ShapeException{
        moveX(deltaX);
        moveY(deltaY);
    }

    public Point copy() throws ShapeException{
        return new Point(x, y);
    }
}

