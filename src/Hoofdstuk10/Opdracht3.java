package Hoofdstuk10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht3 extends Applet{
    //Declaratie

    private TextField tekstvakMaandnummer;
    private String uitkomstMaandEnAantalDagen;
    private int maandEnAantalDagen;

    public void init() {
        //Initialisatie
        setSize(500, 100);

    //Tekstvak maandnummer incl label
    tekstvakMaandnummer = new TextField("",10);
        Label labelMaandNummer = new Label("Type het maandnummer in het tekstvak");
    tekstvakMaandnummer.addActionListener(new TekstvakListener());
    uitkomstMaandEnAantalDagen = "";
    add(labelMaandNummer);
    add(tekstvakMaandnummer);
    }

    public void paint(Graphics g) {
        g.drawString(uitkomstMaandEnAantalDagen, 50, 60);
    }

    class TekstvakListener implements  ActionListener {
        public void actionPerformed(ActionEvent e) {
            String stringMaandnummer = tekstvakMaandnummer.getText();
            maandEnAantalDagen = Integer.parseInt(stringMaandnummer);
            switch (maandEnAantalDagen) {
                case 1:
                    uitkomstMaandEnAantalDagen = "Maand Januari, 31 dagen";
                    break;
                case 2:
                    uitkomstMaandEnAantalDagen = "Maand Februari, 28 dagen";
                    break;
                case 3:
                    uitkomstMaandEnAantalDagen = "Maand Maart, 31 dagen";
                    break;
                case 4:
                    uitkomstMaandEnAantalDagen = "Maand April, 30 dagen";
                    break;
                case 5:
                    uitkomstMaandEnAantalDagen = "Maand Mei, 31 dagen";
                    break;
                case 6:
                    uitkomstMaandEnAantalDagen = "Maand Juni, 30 dagen";
                    break;
                case 7:
                    uitkomstMaandEnAantalDagen = "Maand Juli, 31 dagen";
                    break;
                case 8:
                    uitkomstMaandEnAantalDagen = "Maand Augustus, 31 dag;en";
                    break;
                case 9:
                    uitkomstMaandEnAantalDagen = "Maand September, 30 dagen";
                    break;
                case 10:
                    uitkomstMaandEnAantalDagen = "Maand Oktober, 31 dagen";
                    break;
                case 11:
                    uitkomstMaandEnAantalDagen = "Maand November, 30 dagen";
                    break;
                case 12:
                    uitkomstMaandEnAantalDagen = "Maand December, 31 dagen";
                    break;
                default:
                    uitkomstMaandEnAantalDagen = "U heeft een verkeerd maandnummer ingetypt!";
                    break;
            }
            tekstvakMaandnummer.setText("");
            repaint();
        }
    }
}
