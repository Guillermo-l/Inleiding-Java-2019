package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);

        g.setColor(Color.black);
        g.fillRect(50,50,80,210);
        g.setColor(Color.red);
        g.fillOval(65,65,50,50);
        g.setColor(Color.orange);
        g.fillOval(65,130,50,50);
        g.setColor(Color.green);
        g.fillOval(65,195,50,50);
        g.setColor(Color.black);
        g.fillRect(80,260,20,300);
    }
}

