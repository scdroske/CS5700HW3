package Shapes;

import javax.swing.JFrame;
import java.awt.*;
import java.io.IOException;

public class renderClass {

    public static void main(String[] args) throws IOException{
        //opening file to read scripts
        ReadFile read = new ReadFile();
        read.openFile();
        read.readFile();
        read.closeFile();

        //setting the stage
        JFrame window = new JFrame();
        window.setSize(640, 480);
        window.setTitle("Shapes");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        DrawingComponent drawingComponent = new DrawingComponent();

        //this is where the for loop to run through each component will be
        Shapes shapes = new Shapes();
        window.add(drawingComponent);
        read.WriteFile();


    }
}

public void renderShapes(){



}