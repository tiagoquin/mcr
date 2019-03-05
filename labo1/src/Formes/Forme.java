package Formes;

import Singleton.Rebond;

import java.awt.Graphics;
import java.util.Random;

public abstract class Forme {

    protected int largeur;
    protected int dx, dy;
    protected int x, y;

    public Forme () {

        Random alea = new Random();

        largeur = 10 + alea.nextInt(20);

        // Coordonées de départ
        int borneLageur = (Rebond.getInstance().getWidth() - 2 * largeur);
        int borneHauteur = Rebond.getInstance().getHeight() - 2 * largeur;

        x = alea.nextInt(borneLageur) + largeur;
        y = alea.nextInt(borneHauteur) + largeur;

        //vitesse
        dx = 3 * (alea.nextBoolean() ? -1 : 1);
        dy = 3 * (alea.nextBoolean() ? -1 : 1);
    }

    public void translation () {
        testLimites();
        x += dx;
        y += dy;
    }

    private void testLimites () {

        if (x + dx < 0 || x + dx + largeur > Rebond.getInstance().getWidth()) {
            dx *= -1;
        }


        if (y + dy < 0 || y + dy + 2 * largeur> Rebond.getInstance().getHeight()) {
            dy *= -1;
        }
    }

    public abstract void dessine (Graphics g);

}
