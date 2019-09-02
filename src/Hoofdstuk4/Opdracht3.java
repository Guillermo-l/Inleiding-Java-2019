package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.gray);
        g.setColor(Color.black);
        g.fillRect(30,30,10,700);
        g.setColor(Color.red);
        g.fillRect(40,30,400,100);
        g.setColor(Color.white);
        g.fillRect(40,130,400,100);
        g.setColor(Color.blue);
        g.fillRect(40,230,400,100);
    }
}