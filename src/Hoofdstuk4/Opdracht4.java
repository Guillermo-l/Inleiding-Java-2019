package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);

        g.drawRect(50,30,500,360);

        //Tabel incl diagram met verdeling
        g.setColor(Color.red);
        g.drawLine(45,30,55,30);
        g.drawString("120",20,30 );

        g.drawLine(45,90,55,90);
        g.drawString("100",20,90 );

        g.drawLine(45,150,55,150);
        g.drawString("80",20,150 );

        g.drawLine(45,210,55,210);
        g.drawString("60",20,210 );

        g.drawLine(45,270,55,270);
        g.drawString("40",20,270 );

        g.drawLine(45,330,55,330);
        g.drawString("20",20,330 );

        g.drawLine(45,390,55,390);
        g.drawString("0",20,390 );


        //Valerie incl staafdiagram
        g.setColor(Color.magenta);
        g.fillRect(100,270,50,120);
        g.drawString("Valerie", 105,410);

        //Jeroen incl staafdiagram
        g.setColor(Color.RED);
        g.fillRect(250,90,50,300);
        g.drawString("Jeroen",255,410);

        //Hans incl staafdiagram
        g.setColor(Color.blue);
        g.fillRect(400,150,50,240);
        g.drawString("Hans",410,410);

    }
}