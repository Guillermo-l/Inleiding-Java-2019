package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(30,200,230,200);
        g.drawLine(30,200,130,50);
        g.drawLine(130,50,230,200);
    }
}