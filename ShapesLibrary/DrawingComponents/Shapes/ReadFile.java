package Shapes;

import org.w3c.dom.css.Rect;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

    private Scanner scanner;

    public void openFile() {
        try {
            scanner = new Scanner(new File("C:\\Users\\scdro\\OneDrive\\Desktop\\CS5700\\ShapesLibrary\\DrawingComponents\\Shapes\\inputscript"));
        } catch (Exception e) {
            System.out.println("no file found");
        }
    }

    public void readFile() {
        //code that continues while there is still info in the file
        while (scanner.hasNext()) {
            String shape = scanner.next();
            String x = scanner.next();
            String y = scanner.next();
            String width = scanner.next();
            String height = scanner.next();

            System.out.printf("%s %s %s %s %s\n", shape, x, y, width, height);
        }
    }

    public void ReadFile() {
        List inputShapesList = new ArrayList();

        //code that continues while there is still info in the file
        while (scanner.hasNext()) {
            String shape = scanner.next();
            String x = scanner.next();
            String y = scanner.next();
            String width = scanner.next();
            String height = scanner.next();
            String Shape = shape + "," + x + "," + y + "," + width + "," + height;
            inputShapesList.add(Shape);

            if (shape == "Rectangle") {
                try {
                    //check if rectangle is built, otherwise build rectangle
                } catch (Exception e) {
                    System.out.println("Can not build rectangle");
                }
            }

            if (shape == "Ellipse") {
                try {

                } catch (Exception e) {
                    System.out.println("Can not build ellipse");
                }
            }
        }
    }


        public void closeFile() {
            scanner.close();
        }
    }

