package Shapes;

import javax.swing.JFrame;
import java.awt.*;


public class renderClass {

    public static void main(String[] args){
        JFrame window = new JFrame();
        window.setSize(640, 480);
        window.setTitle("Shapes");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        DrawingComponent drawingComponent = new DrawingComponent();

        //this is where the for loop to run through each component will be
        window.add(drawingComponent);
    }
}
