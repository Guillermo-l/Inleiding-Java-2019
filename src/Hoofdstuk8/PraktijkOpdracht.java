
package Hoofdstuk8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    //Declaratie
    double uitkomstVermenigvuldigen, uitkomstDelen, uitkomstPlus, uitkomstMin;
    double doubleGetallen1Vermenigvuldigen, doubleGetallen2Vermenigvuldigen, doubleGetallen1Delen, doubleGetallen2Delen, doubleGetallen1Plus, doubleGetallen2Plus, doubleGetallen1Min, doubleGetallen2Min;
    TextField tekstvakGetallen1, tekstvakGetallen2;
    Button vermenigvuldigKnop, delenKnop, plusKnop, minKnop;
    String getallen1, getallen2;

    public void init() {
        //Initialisatie
        setSize(500,100);

        //Tekstvak getallen 1
        tekstvakGetallen1 = new TextField("",20);
        add(tekstvakGetallen1);
        getallen1 = "";

        //Tekstvak getallen 2
        tekstvakGetallen2 = new TextField("",20);
        add(tekstvakGetallen2);
        getallen2 = "";

        //Vermenigvuldig knop
        vermenigvuldigKnop = new Button();
        vermenigvuldigKnop.setLabel("*");
        vermenigvuldigKnopListener vkl = new vermenigvuldigKnopListener();
        vermenigvuldigKnop.addActionListener(vkl);
        add(vermenigvuldigKnop);

        //Delen knop
        delenKnop = new Button();
        delenKnop.setLabel("/");
        delenKnopListener dkl = new delenKnopListener();
        delenKnop.addActionListener(dkl);
        add(delenKnop);

        //Plus knop
        plusKnop = new Button();
        plusKnop.setLabel("+");
        plusKnopListener pkl = new plusKnopListener();
        plusKnop.addActionListener(pkl);
        add(plusKnop);

        //Min knop
        minKnop = new Button();
        minKnop.setLabel("-");
        minKnopListener mkl = new minKnopListener();
        minKnop.addActionListener(mkl);
        add(minKnop);
    }

    //Vermenigvuldig knop functie
    class vermenigvuldigKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getallen1 = tekstvakGetallen1.getText();
            getallen2 = tekstvakGetallen2.getText();
            doubleGetallen1Vermenigvuldigen = Double.parseDouble(getallen1);
            doubleGetallen2Vermenigvuldigen = Double.parseDouble(getallen2);
            uitkomstVermenigvuldigen = Math.round((doubleGetallen1Vermenigvuldigen * doubleGetallen2Vermenigvuldigen)*100)/100.0;
            tekstvakGetallen1.setText(Double.toString(uitkomstVermenigvuldigen));
            tekstvakGetallen2.setText("");
            repaint();
        }
    }

    //Delen knop functie
    class delenKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getallen1 = tekstvakGetallen1.getText();
            getallen2 = tekstvakGetallen2.getText();
            doubleGetallen1Delen = Double.parseDouble(getallen1);
            doubleGetallen2Delen = Double.parseDouble(getallen2);
            uitkomstDelen = Math.round((doubleGetallen1Delen / doubleGetallen2Delen)*100)/100.0;
            tekstvakGetallen1.setText(Double.toString(uitkomstDelen));
            tekstvakGetallen2.setText("");
            repaint();
        }
    }

    //Plus knop functie
    class plusKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getallen1 = tekstvakGetallen1.getText();
            getallen2 = tekstvakGetallen2.getText();
            doubleGetallen1Plus = Double.parseDouble(getallen1);
            doubleGetallen2Plus = Double.parseDouble(getallen2);
            uitkomstPlus = Math.round((doubleGetallen1Plus + doubleGetallen2Plus)*100)/100.0;
            tekstvakGetallen1.setText(Double.toString(uitkomstPlus));
            tekstvakGetallen2.setText("");
            repaint();

        }
    }

    //Min knop functie
    class  minKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getallen1 = tekstvakGetallen1.getText();
            getallen2 = tekstvakGetallen2.getText();
            doubleGetallen1Min = Double.parseDouble(getallen1);
            doubleGetallen2Min = Double.parseDouble(getallen2);
            uitkomstMin = Math.round((doubleGetallen1Min - doubleGetallen2Min)*100)/100.0;
            tekstvakGetallen1.setText(Double.toString(uitkomstMin));
            tekstvakGetallen2.setText("");
            repaint();
        }
    }
}