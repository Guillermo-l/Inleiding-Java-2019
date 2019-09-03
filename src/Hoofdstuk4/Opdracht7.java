package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.gray);

        g.setColor(Color.white);
        g.fillRoundRect(50,50,200,200,50,50);
        g.setColor(Color.black);
        g.fillOval(80,80,50,50);
        g.setColor(Color.black);
        g.fillOval(170,80,50,50);
        g.setColor(Color.black);
        g.fillOval(80,170,50,50);
        g.setColor(Color.black);
        g.fillOval(170,170,50,50);
    }
}
