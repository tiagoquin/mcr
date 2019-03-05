package Formes;

import java.awt.*;

public class Carre extends Forme {

    public void dessine (Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.orange);

        g2d.fillRect(x, y, largeur, largeur);
    }

}
