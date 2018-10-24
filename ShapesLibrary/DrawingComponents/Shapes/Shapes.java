package Shapes;

public class Shapes extends ShapeFactory {
    //this is where the script will run against the objects
    String shape;
    Point location;
    boolean compositeShape;
    double area;

    public Shapes(String shape, Point location, boolean compositeShape, double area){
        this.shape = shape;
        this.location = location;
        this.compositeShape = compositeShape;
        this.area = area;
    }

    public String getShape(){return shape;}

    public Point getLocation(){return location;}

    public double getArea(){return area;}

    public boolean isCompositeShape(){return compositeShape;}


    public void generateShape(){
        System.out.print(" " + getShape());

        if(isCompositeShape()){
            System.out.print("Composite Shape");
        }
        System.out.println(", " + getLocation());
        System.out.println("  --" + getArea());
    }
}
