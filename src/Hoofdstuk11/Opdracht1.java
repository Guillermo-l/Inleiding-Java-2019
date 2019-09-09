package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int getallen;
        int y = 0;

        for (getallen = 1; getallen < 11; getallen++) {
            y += 20;
            g.drawLine(50, y, 300, y);
            g.drawString("" + getallen, 305, y);
        }
    }
}