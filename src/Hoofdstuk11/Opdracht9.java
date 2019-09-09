package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht9 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setSize(200, 200);

        int x, y, maxVakken = 7;

        for (int rijHorizontaal = 0; rijHorizontaal <= maxVakken; rijHorizontaal++) {
            for (int rijVerticaal = 0; rijVerticaal <= maxVakken; rijVerticaal++) {
                x = rijHorizontaal * 20;
                y = rijVerticaal * 20;

                if ((rijHorizontaal % 2 == 0) == (rijVerticaal % 2 == 0)) {
                    g.setColor(Color.lightGray);
                } else
                    g.setColor(Color.black);
                g.fillRect(x, y, 20, 20);
            }
        }
    }
}
