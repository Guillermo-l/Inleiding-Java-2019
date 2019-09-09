package Hoofdstuk11;

        import java.applet.Applet;
        import java.awt.*;

public class Opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setSize(525, 525);

        int maxNummer = 50, ovalWidth = 5, ovalHeight = 5, x = 260, y = 260;

        int cirkel;
        for (cirkel = 1; cirkel <= maxNummer; cirkel++) {
            ovalWidth += 10;
            ovalHeight += 10;
            x -= 5;
            y -= 5;
            g.drawOval(x, y, ovalWidth, ovalHeight);
        }

    }
}