import TurtleGraphics.*;
import TerminalIO.*;
import java.awt.Color;
public class BarChart2 {

    
    public static void main(String[] args) {
        int h1, h2, h3, h4;
        KeyboardReader r = new KeyboardReader();
        
        //Bar 1
            h1 = r.readInt("Enter the height of the 1st bar: ");
        //Bar 2
            h2 = r.readInt("Enter the height of the 2nd bar: ");
        //Bar 3
            h3 = r.readInt("Enter the height of the 3rd bar: ");
        //Bar 4
            h4 = r.readInt("Enter the height of the 4th bar: ");
            
        //Create window and draw
            Pen p = new StandardPen(new SketchPadWindow(800,600));   
        // Draw Bar 1
            p.up();
            p.setColor(new Color (240,150,190));
            p.setWidth(100);
            p.move(-300, -300);
            p.down();
            p.setDirection(90);
            p.move(h1);
            p.up();
            p.move(60);
            p.setDirection(180);
            p.move(25);
            p.drawString("Value: " + h1);

        // Draw Bar 2
            p.up();
            p.setColor(new Color (255,180,140));
            p.setWidth(100);
            p.move(-150, -300);
            p.down();
            p.setDirection(90);
            p.move(h2);
            p.up();
            p.move(60);
            p.setDirection(180);
            p.move(25);
            p.drawString("Value: " + h2);

        // Draw Bar 3
            p.up();
            p.setColor(new Color (255,255,140));
            p.setWidth(100);
            p.move(0, -300);
            p.down();
            p.setDirection(90);
            p.move(h3);
            p.up();
            p.move(60);
            p.setDirection(180);
            p.move(25);
            p.setColor(new Color (200,200,70));
            p.drawString("Value: " + h3);

        // Draw Bar 4
            p.up();
            p.setColor(new Color (200,255,200));
            p.setWidth(100);
            p.move(150, -300);
            p.down();
            p.setDirection(90);
            p.move(h4);
            p.up();
            p.move(60);
            p.setDirection(180);
            p.move(25);
            p.setColor(new Color (140,235,140));
            p.drawString("Value: " + h4);

    }
    
}
