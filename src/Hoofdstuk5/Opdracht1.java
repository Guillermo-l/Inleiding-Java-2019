package Hoofdstuk5;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet{
    //Declaratie
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //Initialisatie
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.black;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        //Lijn
        g.drawLine(30,30,230,30);
        g.drawString("Lijn",120,42);

        //Rechthoek
        g.drawRect(30,50,breedte,hoogte);
        g.drawString("Rechthoek",100,162);

        //Afgeronde rechthoek
        g.drawRoundRect(30,170,breedte,hoogte,30,30);
        g.drawString("Afgeronde rechthoek",70,282);

        //Gevulde rechthoek met ovaal
        g.setColor(opvulkleur);
        g.fillRect(250,50,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(250,50,breedte,hoogte);
        g.drawString("Gevulde rechthoek met ovaal",270,162);

        //Gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(250,170,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal",310,282);

        //Taartpunt met ovaal eromheen
        g.setColor(opvulkleur);
        g.fillArc(500,50,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawOval(500,50,breedte,hoogte);
        g.drawString("Taartpunt met ovaal eromheen",525,162);

        //Cirkel
        g.drawOval(550,170,100,100);
        g.drawString("Cirkel",585,282);
    }
}
