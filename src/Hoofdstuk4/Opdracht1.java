package Hoofdstuk4;

    import java.applet.Applet;
    import java.awt.*;

public class Opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
       g.drawLine(30,200,130,200);
       g.drawLine(30,200,80,100);
       g.drawLine(80,100,130,200);
    }
}
