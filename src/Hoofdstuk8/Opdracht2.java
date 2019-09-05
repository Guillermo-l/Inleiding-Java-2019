package Hoofdstuk8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht2 extends Applet {
    //Declaratie
    int mannen, vrouwen, potentielemannen, potentielevrouwen;
    int uitkomstmannen = 0, uitkomstvrouwen = 0, uitkomstPotentielemannen = 0, uitkomstPotentielevrouwen = 0;

    TextField tekstvakMannen, tekstvakVrouwen;
    TextField tekstvakPotentielemannen, tekstvakPotentielevrouwen;
    Label labelMannen, labelVrouwen;
    Label labelPotentielemannen, labelPotentielevrouwen;
    Button OKknop, Resetknop;
    String am, av, apm, apv;



    public void init() {
        //Initialisatie
        setSize(480, 300);

        //Tekstvak voor mannen
        tekstvakMannen = new TextField("", 20);
        labelMannen = new Label("Type het aantal mannen in het tekstvak!");
        add(labelMannen);
        add(tekstvakMannen);
        am = "";


        //Tekstvak voor vrouwen
        tekstvakVrouwen = new TextField("", 20);
        labelVrouwen = new Label("Type het aantal vrouwen in het tekstvak!");
        add(labelVrouwen);
        add(tekstvakVrouwen);
        av = "";

        //Tekstvak voor potentiele mannen
        tekstvakPotentielemannen = new TextField("", 20);
        labelPotentielemannen = new Label("Type het aantal potentiele mannen in het tekstvak!");
        add(labelPotentielemannen);
        add(tekstvakPotentielemannen);
        apm = "";

        //Tekstvak voor potentiele vrouwen
        tekstvakPotentielevrouwen = new TextField("", 20);
        labelPotentielevrouwen = new Label("Type het aantal potentiele vrouwen in het tekstvak!");
        add(labelPotentielevrouwen);
        add(tekstvakPotentielevrouwen);
        apv = "";

        //OK knop
        OKknop = new Button();
        OKknop.setLabel("OK");
        OKknopListener okl = new OKknopListener();
        OKknop.addActionListener(okl);
        add(OKknop);

        //Reset knop
        Resetknop = new Button();
        Resetknop.setLabel("Reset");
        ResetknopListener rkl = new ResetknopListener();
        Resetknop.addActionListener(rkl);
        add(Resetknop);
    }

    public void paint(Graphics g) {
        g.drawString("Aantal mannen:" + uitkomstmannen, 50, 180);
        g.drawString("Aantal vrouwen:" + uitkomstvrouwen, 50, 200);
        g.drawString("Aantal potentiele mannen:" + uitkomstPotentielemannen, 50, 220);
        g.drawString("Aantal potentielevrouwen:" + uitkomstPotentielevrouwen, 50, 240);
    }

    //OK knop functie
    class OKknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            am = tekstvakMannen.getText();
            mannen = Integer.parseInt(am);
            uitkomstmannen += mannen;

            av = tekstvakVrouwen.getText();
            vrouwen = Integer.parseInt(av);
            uitkomstvrouwen += vrouwen;

            apm = tekstvakPotentielemannen.getText();
            potentielemannen = Integer.parseInt(apm);
            uitkomstPotentielemannen += potentielemannen;

            apv = tekstvakPotentielevrouwen.getText();
            potentielevrouwen = Integer.parseInt(apv);
            uitkomstPotentielevrouwen += potentielevrouwen;
            repaint();
        }
    }

    //Reset knop functie
    class ResetknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvakMannen.setText("");
            am = "";
            tekstvakVrouwen.setText("");
            av = "";
            tekstvakPotentielemannen.setText("");
            apm = "";
            tekstvakPotentielevrouwen.setText("");
            apv = "";
            repaint();
        }
    }
}