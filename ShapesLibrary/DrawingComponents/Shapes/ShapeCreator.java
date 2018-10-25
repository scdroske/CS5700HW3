package Shapes;

import java.util.Iterator;

public class ShapeCreator {
    ShapeFactory allShapes;

    public ShapeCreator(ShapeFactory allShapes){
        this.allShapes = allShapes;
    }

    public void printShapes(){
        allShapes.generateShape();
    }

    //public void ifCompositeShape(){
    //    Iterator iterator = allShapes.createIterator();
    //    System.out.println("\n CompositeShapes");
    //    while(iterator.hasNext()){
    //        ShapeFactory shapeFactory = (ShapeFactory) iterator.next();
    //        try{
    //            if(shapeFactory.isCompositeShape()){
    //                shapeFactory.print();
    //            }
    //        }
    //        catch{UnsupportedOperationException e){};
    //}
}



//pg 345 in head first design patterns
