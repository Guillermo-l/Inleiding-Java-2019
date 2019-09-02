package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        //Het dak van het huis
        g.drawLine(30,200,230,200);
        g.drawLine(30,200,130,50);
        g.drawLine(130,50,230,200);
        //De voorgevel van het huis
        g.drawRect(30,200,200,200);
        //De deur van het huis
        g.drawRect(100,330,40,70);
        //De deurknop
        g.fillOval(134,370,5,5);
        //Raam links van de deur
        g.drawRect(45,335,35,35);
        //Raam Rechts van de deur
        g.drawRect(150,335,75,60);
    }
}
