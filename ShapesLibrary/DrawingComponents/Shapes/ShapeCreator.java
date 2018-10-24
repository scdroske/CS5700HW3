package Shapes;

public class ShapeCreator {
    ShapeFactory allShapes;

    public ShapeCreator(ShapeFactory allShapes){
        this.allShapes = allShapes;
    }

    public void printShapes(){
        allShapes.generateShape();
    }
}
