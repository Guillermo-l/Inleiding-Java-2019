package Hoofdstuk6;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {
    //Declaratie
    double a, b, c, d, uitkomst, uitkomst2, afgerond;

    public void init() {
        //Initialisatie
        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = (a + b + c) / 3;
        d = (int)(10 * uitkomst);
        uitkomst2 = d / 10;
        afgerond = Math.round (uitkomst*10)/10.0;
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + uitkomst,50,50);
        g.drawString("Gemiddelde afgekapt op 1 decimaal: "+ uitkomst2,50,75);
        g.drawString("Gemiddelde afgerond op 1 decimaal: "+ afgerond ,50,100);
    }
}