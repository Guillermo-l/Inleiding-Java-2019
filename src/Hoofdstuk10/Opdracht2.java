package Hoofdstuk10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class Opdracht2 extends Applet {
    //Declaratie

    private int maxInput = 0, minInput = 99999, inputGetallen = 0;
    private TextField tekstvakGetallen;

    public void init() {
        //Initialisatie
        setSize(500,100);

        //Tekstvak getallen 1 incl label
        tekstvakGetallen = new TextField("",20);
        Label labelGetallen = new Label("Type een getal en druk op enter");
        tekstvakGetallen.addActionListener(new TekstvakListener() );
        add(labelGetallen);
        add(tekstvakGetallen);
        inputGetallen = 0;
    }

    public void paint(Graphics g) {
        g.drawString("Het hoogste getal is: " + maxInput ,75, 60 );
        g.drawString("Het laagste getal is: "+ minInput ,75,80);
    }

    class TekstvakListener implements  ActionListener{
        public void actionPerformed(ActionEvent e) {
            String hoogsteOfLaagsteGetal = tekstvakGetallen.getText();
            inputGetallen = Integer.parseInt(hoogsteOfLaagsteGetal);
            if (inputGetallen > maxInput) {
                maxInput = inputGetallen;
            }
            if (inputGetallen < minInput) {
                minInput = inputGetallen;
            }
                tekstvakGetallen.setText("");
                repaint();
        }
    }
}