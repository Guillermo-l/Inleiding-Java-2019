package Hoofdstuk10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class Opdracht1 extends Applet {
    //Declaratie
    private int maxInput = 0, inputGetallen;
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
        g.drawString("Het hoogste getal is: " + maxInput ,50, 60 );
    }

    class TekstvakListener implements  ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s = tekstvakGetallen.getText();
            inputGetallen = Integer.parseInt(s);
            if ( inputGetallen > maxInput) {
                maxInput = inputGetallen;
            }
            tekstvakGetallen.setText("");
            repaint();
        }
    }
}