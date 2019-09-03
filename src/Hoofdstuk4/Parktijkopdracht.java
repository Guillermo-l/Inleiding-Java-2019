package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Parktijkopdracht extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        //Lijn
        g.drawLine(30,30,230,30);
        g.drawString("Lijn",120,42);

        //Rechthoek
        g.drawRect(30,50,200,100);
        g.drawString("Rechthoek",100,162);

        //Afgeronde rechthoek
        g.drawRoundRect(30,170,200,100,30,30);
        g.drawString("Afgeronde rechthoek",70,282);

        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(250,50,200,100);
        g.setColor(Color.black);
        g.drawOval(250,50,200,100);
        g.drawString("Gevulde rechthoek met ovaal",270,162);

        //Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(250,170,200,100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",310,282);

        //Taartpunt met ovaal eromheen
        g.setColor(Color.magenta);
        g.fillArc(500,50,200,100,0,45);
        g.setColor(Color.black);
        g.drawOval(500,50,200,100);
        g.drawString("Taartpunt met ovaal eromheen",525,162);

        //Cirkel
        g.drawOval(550,170,100,100);
        g.drawString("Cirkel",585,282);
    }
}
