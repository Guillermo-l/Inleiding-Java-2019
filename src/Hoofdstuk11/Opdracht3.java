package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setSize(250,250);

        int maxNummer = 10, vorigNummer = 0, volgendNummer = 1, som, y = 20;

        for (int aantalNummers = 1; aantalNummers < maxNummer; ++aantalNummers) {
            som = vorigNummer + volgendNummer;
            vorigNummer = volgendNummer;
            volgendNummer = som;
            y += 20;
            g.drawString("Rij van Fibonacci", 50, 20 );
            g.drawString("" + vorigNummer,50,y );
        }
    }
}