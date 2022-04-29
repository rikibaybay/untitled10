import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;

public class lab16 extends Canvas {
    public static void main(String[] args){
        JFrame frame = new JFrame ("My Drawing");
        Canvas canvas = new lab16();
        canvas.setSize(500, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);

    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.black);
        BasicStroke pen1 = new BasicStroke(20);
        g.drawRect(50, 150, 150, 150);
        g.drawRect(75, 200, 50, 50);
        g.drawLine(25,175,125,75);
        g.drawLine(225,175,125,75);
        g.drawLine(338,250,338,300);
        g.drawLine(362,250,362,300);
        g.drawLine(150,75,150,100);
        g.drawLine(150,75,175,75);
        g.drawLine(175,75,175,125);
        g.drawArc(275, 50, 150, 200, -81, 342);

    }
}
