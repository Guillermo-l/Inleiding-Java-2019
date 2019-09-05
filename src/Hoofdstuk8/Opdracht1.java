package Hoofdstuk8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
    //Declaratie
    TextField tekstvak;
    Label label;
    Button OKknop;
    Button Resetknop;
    String s;

    public void init() {
        //Initialisatie
        setSize(500,100);

        //Tekstvak
        tekstvak = new TextField("",20);
        label = new Label("Type iets in het tekstvak!");
        add(label);
        add(tekstvak);
        s = "";


        //OK knop
        OKknop = new Button();
        OKknop.setLabel("OK");
        OKknopListener okl = new OKknopListener();
        OKknop.addActionListener( okl );
        add(OKknop);

        //Reset knop
        Resetknop = new Button();
        Resetknop.setLabel("Reset");
        ResetknopListener rkl = new ResetknopListener();
        Resetknop.addActionListener( rkl );
        add(Resetknop);
    }

    public void paint(Graphics g) {
        g.drawString(s,50,60);
    }

    //OK knop functie
    class OKknopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            repaint();
        }
    }

    //Reset knop functie
    class ResetknopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            s = "";
            repaint();
        }
    }
}