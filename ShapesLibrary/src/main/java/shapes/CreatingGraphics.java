package shapes;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;


public class CreatingGraphics {
    ImageFrame frame = new ImageFrame();


}

class ImageFrame extends JFrame {
    public ImageFrame() {
        setSize(Default_Width, Default_Height);

        ImageComponent component = new ImageComponent();
        add(component);
    }


    public static int Default_Width = 300;
    public static int Default_Height = 300;

}

class ImageComponent extends JComponent{
    private Image image;
    public ImageComponent(){
        try{
            File images = new File("pathtofiles");
            image = ImageIO.read(images);
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}