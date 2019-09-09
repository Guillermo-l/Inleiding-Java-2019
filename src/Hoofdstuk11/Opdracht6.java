package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setSize(250, 250);

        int maxNummer = 5, ovalWidth = 30, ovalHeight = 30, x = 70, y = 70;

        for (int cirkel = 1; cirkel <= maxNummer; cirkel++) {
            ovalWidth += 20;
            ovalHeight += 20;
            x -= 10;
            y -= 10;
            g.drawOval(x, y, ovalWidth, ovalHeight);
        }

    }
}