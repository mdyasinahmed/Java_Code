package src.image;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;

public class SimpleImageLoad extends Frame {
    Image img;

    public SimpleImageLoad() {
        try {
            File imageFile = new File("flowers.jpg");

            // Load the image
            img = ImageIO.read(imageFile);
        } catch (IOException exc) {
            System.out.println("Cannot Load Image File.");
            System.exit(0);
        }
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }

    public void paint (Graphics g) {
        g.drawImage(img, getInsets().left, getInsets().top, null);
    }

    public static void main(String[] args) {
        SimpleImageLoad flower = new SimpleImageLoad();

        flower.setSize(new Dimension(600, 420));
        flower.setTitle("SimpleImageLoad");
        flower.setVisible(true
        );
    }
}