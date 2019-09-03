package Hoofdstuk6;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
    //Declaratie
    int a,b,uitkomst;

    public void init() {
        //Initialisatie
        a = 1073741820;
        b = 1074741820;
        uitkomst = a + b;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst,50,50);
    }
}