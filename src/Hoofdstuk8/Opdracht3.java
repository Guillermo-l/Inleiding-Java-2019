package Hoofdstuk8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht3 extends Applet {
    //Declaratie
    double inclBTW, uitkomstInclBTW, afgerondInclBTW;
    TextField tekstvakBedrag;
    Label label;
    Button OKknop;
    Button Resetknop;
    String bedrag;


    public void init() {
        //Initialisatie
        setSize(300,150);

        //Tekstvak
        tekstvakBedrag = new TextField("", 20);
        label = new Label("Type een bedrag in het tekstvak");
        tekstvakBedrag.addActionListener(new TekstvakListener() );
        add(label);
        add(tekstvakBedrag);
        bedrag = "";

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
        g.drawString("Bedrag Incl. BTW: €" + afgerondInclBTW,50,90);
    }

    class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            bedrag = tekstvakBedrag.getText();
            inclBTW = Double.parseDouble(bedrag);
            uitkomstInclBTW = inclBTW *1.21;
            afgerondInclBTW = Math.round(uitkomstInclBTW*100)/100.0;
            repaint();
        }
    }

    //OK knop functie
    class OKknopListener implements ActionListener{
        public void actionPerformed( ActionEvent e ) {
            bedrag = tekstvakBedrag.getText();
            inclBTW = Double.parseDouble(bedrag);
            uitkomstInclBTW = inclBTW *1.21;
            afgerondInclBTW = Math.round(uitkomstInclBTW*100)/100.0;
            repaint();
        }
    }

    //Reset knop functie
    class ResetknopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            tekstvakBedrag.setText("");
            // = "";
            repaint();
        }
    }
}

