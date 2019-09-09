package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdracht1 extends Applet {
    //Declaratie

    private int tafelVan;
    private TextField tekstvakTafel;

    public void init() {
        //Initialisatie
        setSize(500, 350);

        //Tekstvak
        tekstvakTafel = new TextField("", 20);
        Label labelTekstvakTafel = new Label("Type in welke tafel je wilt weergeven");
        add(labelTekstvakTafel);
        add(tekstvakTafel);

        //OK knop
        Button OKknop = new Button();
        OKknop.setLabel("OK");
        OKknopListener okl = new OKknopListener();
        OKknop.addActionListener(okl);
        add(OKknop);
    }

    public void paint(Graphics g) {
        int y = 80;

        for (int i = 1; i <= 10; i++) {
            g.drawString("" + i + " * " + tafelVan + " = " + i * tafelVan, 50, y);
            y += 20;
        }
    }

    //OK knop functie
    class OKknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafelVan = Integer.parseInt(tekstvakTafel.getText());
            repaint();
        }
    }
}