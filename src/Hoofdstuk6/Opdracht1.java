package Hoofdstuk6;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    //Declaratie
    double a, aantalPersonen, uitkomst;


    public void init() {
        //Initialisatie
        a = 113;
        aantalPersonen = 4;
        uitkomst = a / aantalPersonen;
    }

    public void paint(Graphics g) {
        g.drawString("Jan verdient: €"+ uitkomst,50,50);
        g.drawString("Ali verdient: €"+ uitkomst,50,70);
        g.drawString("Jeannette verdient: €"+ uitkomst,50,90);
        g.drawString("Ik verdien: €"+ uitkomst,50,110);
    }
}