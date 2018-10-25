package Shapes;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EmbeddedPictureIntrinsic {
    public static void main(String[] argv) throws Exception {
        //Read from an input stream
        InputStream is = new BufferedInputStream(new FileInputStream("source.gif"));
        Image image = ImageIO.read(is);

        JFrame frame = new JFrame();
        JLabel label = new JLabel(new ImageIcon(image));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}