package Hoofdstuk10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet{
    //Declaratie
    private TextField tekstvakCijfer;
    private String beoordelingCijfer = "";

    public void init() {
    //Initialisatie
        setSize(500,150);

        //Tekstvak
        tekstvakCijfer = new TextField("",10);
        Label labelTekstvakCijfer = new Label("Type je cijfer in het tekstvak");
        tekstvakCijfer.addActionListener(new TekstvakListener());
        beoordelingCijfer = "";
        add(labelTekstvakCijfer);
        add(tekstvakCijfer);
    }

    public void paint(Graphics g) {
        g.drawString(beoordelingCijfer, 50, 60);
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String strringCijfer = tekstvakCijfer.getText();
            int cijfer = Integer.parseInt(strringCijfer);
            switch (cijfer) {
                case 1:
                case 2:
                case 3:
                    beoordelingCijfer = "Het cijfer is slecht!";
                    break;
                case 4:
                    beoordelingCijfer = "Het cijfer is onvoldoende!";
                    break;
                case 5:
                    beoordelingCijfer = "Het cijfer is matig!";
                    break;
                case 6:
                case 7:
                    beoordelingCijfer = "Het cijfer is voldoende!";
                    break;
                case 8:
                case 9:
                case 10:
                    beoordelingCijfer = "Het cijfer is goed!";
                    break;
                default :
                    beoordelingCijfer = "Verkeerd cijfer ingevoerd!";
                    break;
            }
            tekstvakCijfer.setText("");
            repaint();
        }
    }
}
