package Hoofdstuk10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht4 extends Applet {
    //Declaratie

    private TextField tekstvakMaandnummer, tekstvakJaar;
    private String uitkomstMaandEnAantalDagen;

    public void init() {
        //Initialisatie
        setSize(600, 80);

        //Tekstvak Maandnummer incl label
        tekstvakMaandnummer = new TextField("", 10);
        Label labelMaandNummer = new Label("Type het maandnummer in het tekstvak");
        tekstvakMaandnummer.addActionListener(new TekstvakListener());
        uitkomstMaandEnAantalDagen = "";
        add(labelMaandNummer);
        add(tekstvakMaandnummer);

        //Tekstvak Jaar incl label
        tekstvakJaar = new TextField("", 10);
        Label labelJaar = new Label("Type hier het jaar in");
        tekstvakJaar.addActionListener(new TekstvakListener());
        add(labelJaar);
        add(tekstvakJaar);
    }

    public void paint(Graphics g) {
        g.drawString(uitkomstMaandEnAantalDagen, 50, 70);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String stringJaren = tekstvakJaar.getText();
            int jaartal = Integer.parseInt(stringJaren);
            String stringMaandenEnDagen = tekstvakMaandnummer.getText();
            int maandEnAantalDagen = Integer.parseInt(stringMaandenEnDagen);
            switch (maandEnAantalDagen) {
                case 1:
                    uitkomstMaandEnAantalDagen = "Maand Januari, 31 dagen";
                    break;
                case 2:
                    if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0) {
                        uitkomstMaandEnAantalDagen = "Maand Februari, 29 dagen, dit is een schrikkeljaar";
                    }
                    else {
                        uitkomstMaandEnAantalDagen = "Maand Februari, 28 dagen, dit is geen schrikkeljaar";
                    }
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
            repaint();
        }
    }
}

