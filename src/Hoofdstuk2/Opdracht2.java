package Hoofdstuk2;

    import java.applet.Applet;
    import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString("Guillermo",50,60);
        g.drawString("Latumahina",50,80);
    }
}
