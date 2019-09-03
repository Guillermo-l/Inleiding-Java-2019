package Hoofdstuk6;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    //Declaratie
    int minuut,uur,dag,jaar;

    public void init() {
        //Initialisatie
        minuut = 60 * 1;
        uur = minuut * 60;
        dag = uur * 24;
        jaar = dag * 365;
    }

    public void paint(Graphics g) {
        g.drawString("Aantal seconden in een uur: " + minuut,50,50);
        g.drawString("Aantal seconden in een uur: " + uur,50,70);
        g.drawString("Aantal seconden in een dag: " + dag,50,90);
        g.drawString("Aantal seconden in een jaar: " + jaar,50,110);
    }
}