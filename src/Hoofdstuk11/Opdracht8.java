package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht8 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setSize(530, 530);

        int maxNummer = 100, ovalWidth = 5, ovalHeight = 5;

        for (int cirkel = 1; cirkel <= maxNummer; cirkel++) {
            ovalWidth += 5;
            ovalHeight += 5;
            g.drawOval(20, 20, ovalWidth, ovalHeight);
        }
    }
}