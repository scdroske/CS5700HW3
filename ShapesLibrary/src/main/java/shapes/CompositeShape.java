package shapes;


import java.util.ArrayList;
import java.util.List;

/**
 * Composite object supporting creation of more complex shapes
 *  Complex Shape
 */


//Composite
 //   2
 //   Composite
//    2
//    Circle
//       1 , 1, 5
//    Line
 ////       10, 10, 20, 20
 //   Rectangle
//        30, 30, 50, 60
//when going through composite function, use recursion .. while loop or if statement, for loop for numbers to run through if composite
//look up forest example for drawing pictures from java etc.






public class CompositeShape implements Shape {

    private String compositeName;
    private Point origin;
    /**
     * List of shapes
     */
    List shapeList = new ArrayList();

    /**
     *
     */
    public void addToShape(Shape shapeToAddToCurrentShape) {
        shapeList.add(shapeToAddToCurrentShape);

    }

    @Override
    public Point getOriginPoint(Point origin) {
        return origin;
    }


    @Override
    public double getArea(double length, double height) {
        double totalCompositeArea =0;
        for (Shape : shapeList) {
            totalCompositeArea += Shape;
        }
        return 0;
    }

    @Override
    public double moveShape(Point origin) {
        return 0;
    }


    /**
     * this method is implemented directly in basic shapes
     * in complex shapes this method is handled with delegation
     */


}