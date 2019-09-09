package Hoofdstuk11;

        import java.applet.Applet;
        import java.awt.*;

public class Opdracht5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setSize(250, 200);

        int maxNummer = 5, y = 0, x = 0;

        for (int blok = 1; blok <= maxNummer; blok++) {
            y += 25;
            x += 25;
            g.drawRect(x, y, 25, 25);
        }
    }
}
