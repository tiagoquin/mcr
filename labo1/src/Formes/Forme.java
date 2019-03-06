package Formes;

import Singleton.Rebond;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

public abstract class Forme {

    protected int largeur;
    protected int dx, dy;
    protected int x, y;
    //correction bas de fenetre selon system
    static protected int decalage;

    protected Dimension coordonnee; // TODO: 2019-03-05  
    protected Dimension vitesse; // TODO: 2019-03-05

    {
        //set de la valeur de correction selon l'os
        if (System.getProperty("os.name").equals("Windows")) {
            decalage = 40;
        } else if (System.getProperty("os.name").equals("Windows")) {
            decalage = 20;
        } else {
            decalage = 30;
        }
    }

    public Forme() {

        Random alea = new Random();

        largeur = 10 + alea.nextInt(20);

        // Coordonées de départ
        int borneLargeur = Rebond.getInstance().getWidth() - largeur;
        int borneHauteur = Rebond.getInstance().getHeight() - largeur - 20;

        x = alea.nextInt(borneLargeur);
        y = alea.nextInt(borneHauteur);

        //vitesse
        dx = 1 + alea.nextInt(6) * (alea.nextBoolean() ? -1 : 1);
        dy = 1 + alea.nextInt(6) * (alea.nextBoolean() ? -1 : 1);
    }

    public void translation() {
        testLimites();
        x += dx;
        y += dy;
    }

    private void testLimites() {
        if (x + dx < 0 || x + dx + largeur > Rebond.getInstance().getWidth()) {
            dx *= -1;
        }

        if (y + dy < 0 || y + dy + largeur > Rebond.getInstance().getHeight() - decalage) {
            dy *= -1;
        }


    }

    public abstract void dessine(Graphics g);

}
