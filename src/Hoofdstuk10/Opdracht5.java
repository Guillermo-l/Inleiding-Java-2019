package Hoofdstuk10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {
    //Declaratie

    private double totaal;
    private int aantalCijfers;
    private String behaaldeCijfer;

    private TextField tekstvakCijfer;

    public void init() {
        //Initialisatie
        setSize(400, 100);

        //Tekstvak Cijfers incl label
        tekstvakCijfer = new TextField("", 20);
        Label labelTekstvakCijfer = new Label("Type hier je cijfers in");
        tekstvakCijfer.addActionListener(new TekstvakListener());
        add(labelTekstvakCijfer);
        add(tekstvakCijfer);
        aantalCijfers = 0;
        behaaldeCijfer = "";
    }

    public void paint(Graphics g) {
        g.drawString("Ingevoerd cijfer: " + tekstvakCijfer.getText(), 50, 70);
        g.drawString("Jouw gemiddelde cijfer is: " + behaaldeCijfer, 50, 90);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvakCijfer.getText();
            double inputCijfer = Double.parseDouble(s);
            totaal += inputCijfer;
            aantalCijfers++;
            double gemiddeldeCijfer = Math.round((totaal / aantalCijfers) * 10) / 10.0;
            if (gemiddeldeCijfer > 5.5) {
                behaaldeCijfer = gemiddeldeCijfer + " Voldoende je bent geslaagd";
            } else {
                behaaldeCijfer = gemiddeldeCijfer + " Onvoldoende je bent gezakt";
            }
            tekstvakCijfer.setText("");
            repaint();
        }
    }
}