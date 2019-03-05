package Formes;

import java.awt.*;

public class Cercle extends Forme {

    public void dessine (Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.PINK);

        g2d.fillOval(x, y, largeur, largeur);
    }
}
