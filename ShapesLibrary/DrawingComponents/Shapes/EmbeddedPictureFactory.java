package Shapes;

import java.util.ArrayList;
import java.util.List;

public abstract class EmbeddedPictureFactory {
    List embeddedPictures = new ArrayList();

    public void addImage(EmbeddedPictureFactory embeddedPictureFactory){
        throw new UnsupportedOperationException();
    }

    public void removeShape(EmbeddedPictureFactory embeddedPictureFactory){
        throw new UnsupportedOperationException();
    }

    public EmbeddedPictureFactory getChild(int i){
        throw new UnsupportedOperationException();
    }

    //extrinsic info

    public String getImage(){
        throw new UnsupportedOperationException();
    }

    public Point getLocation(){
        throw new UnsupportedOperationException();
    }

    public double getArea(){
        throw new UnsupportedOperationException();
    }

    public void generateImages(){
        throw new UnsupportedOperationException();
    }
}