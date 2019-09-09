package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setSize(250, 250);

        int y = 50, tafelVan3 = 3;
        for (int i = 1; i <= 10; i++) {
            g.drawString("" + i + " * " + tafelVan3 + " = " + i * tafelVan3, 50, y);
            y += 20;
        }
    }
}