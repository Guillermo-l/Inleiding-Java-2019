package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int getallen;
        int y = 0;

        for (getallen = 20; getallen > 9; getallen--) {
            y += 20;
            g.drawString("" + getallen, 50, y );
        }
    }
}