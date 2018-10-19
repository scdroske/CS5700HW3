package shapes;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class EmbeddedPicture extends java.applet.Applet {
    List embeddedPictureList = new ArrayList();

    //read script in

    String imageFilePath;
    Panel p;
    Label t;
    Image image, caption;

    public void init() {

        setSize(1360, 700);
        setBackground(Color.black);

        p = new Panel();
        p.setBackground(Color.white);

        add(p);
        t = new Label();

        p.add(t);

    }

}



public String getHtmlMessage(String htmlMessage){
    String imageFilePath;
    String urlFilePath;

    htmlMessage = "</html>";
    return htmlMessage;
}

