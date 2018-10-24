package Shapes;

import org.w3c.dom.css.Rect;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

    public Scanner scanner;
    private List inputShapesList = new ArrayList();

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


        //code that continues while there is still info in the file
        while (scanner.hasNext()) {
            String shape = scanner.next();
            String x = scanner.next();
            String y = scanner.next();
            String width = scanner.next();
            String height = scanner.next();
            String Shape = shape + "," + x + "," + y + "," + width + "," + height;
            inputShapesList.add(Shape);

            int X = Integer.parseInt(x);
            int Y = Integer.parseInt(y);
            int WIDTH = Integer.parseInt(width);
            int HEIGHT = Integer.parseInt(height);

            if (shape == "Rectangle") {
                try {
                    //check if rectangle is built, otherwise build rectangle
                    Rectangle rect = new Rectangle();
                    rect.rectangle(X, Y, WIDTH, HEIGHT);

                } catch (Exception e) {
                    System.out.println("Can not build rectangle");
                }
            }

            if (shape == "Ellipse") {
                try {
                    //check if ellipse is built, otherwise build rectangle
                    Ellipse2D.Double ellipse = new Ellipse2D.Double();

                } catch (Exception e) {
                    System.out.println("Can not build ellipse");
                }
            }

            if (shape == "Circle") {
                try {

                } catch (Exception e) {
                    System.out.println("Can not build Circle");
                }
            }

            if (shape == "Square") {
                try {

                } catch (Exception e) {
                    System.out.println("Can not build Square");
                }
            }
            if (shape == "Composite") {
                try {

                } catch (Exception e) {
                    System.out.println("Can not build Composite");
                }
            }
        }


    }

    public void WriteFile() throws IOException {

        String fileContent = inputShapesList.toString();

        FileWriter fileWriter =  new FileWriter("C:\\Users\\scdro\\OneDrive\\Desktop\\CS5700\\ShapesLibrary\\DrawingComponents\\Shapes\\outputscript.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(fileContent);
        printWriter.printf("Shapes: %s");
        printWriter.close();
    }



    public void closeFile() {
            scanner.close();
        }
    }

