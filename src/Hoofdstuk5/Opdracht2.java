package Hoofdstuk5;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    //Declaratie
    Color opvulkleur;

    int Valerie;
    int ValerieHeight;
    int Jeroen;
    int JeroenHeight;
    int Hans;
    int HansHeight;

    //Alle rechten vermigvuldigen met factor 3 ivm schaalverdeling y-as
    final int FACTOR = 3;

    public void init() {
        setSize(600,500);
        //Initialisatie
        opvulkleur = Color.blue;
        Valerie = 54;
        Jeroen = 65;
        Hans = 78;

        ValerieHeight = FACTOR * Valerie;
        JeroenHeight = FACTOR * Jeroen;
        HansHeight = FACTOR * Hans;
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);

        //Tabel incl diagram met verdeling
        g.drawRect(50,30,500,360);

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
        g.setColor(opvulkleur);
        g.fillRect(100,390-ValerieHeight,50,ValerieHeight);
        g.drawString("Valerie", 105,410);

        //Jeroen incl staafdiagram
        g.setColor(opvulkleur);
        g.fillRect(250,390-JeroenHeight,50,JeroenHeight);
        g.drawString("Jeroen",255,410);

        //Hans incl staafdiagram
        g.setColor(opvulkleur);
        g.fillRect(400,390-HansHeight,50,HansHeight);
        g.drawString("Hans",410,410);
    }
}