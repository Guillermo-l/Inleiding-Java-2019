package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);

        g.setColor(Color.yellow);
        g.fillArc(50,50,200,200,30,315);
    }
}
