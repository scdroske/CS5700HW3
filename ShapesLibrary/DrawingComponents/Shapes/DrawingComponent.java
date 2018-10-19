package Shapes;

import javax.swing.*;
import java.awt.*;

public class DrawingComponent extends JComponent {

    public void paintComponent(Graphics g){
         Graphics2D graphic = (Graphics2D) g;


         Rectangle rect1 = new Rectangle(5,5,100,200);
         graphic.draw(rect1);
    }



}
