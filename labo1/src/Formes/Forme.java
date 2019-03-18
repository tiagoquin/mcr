package Formes;

import Displayer.Bouncable;
import Renderable.Renderable;
import Singleton.Rebond;

import java.awt.*;
import java.util.Random;

public abstract class Forme  implements Bouncable {

    private Renderable renderable;
    protected Color color;
    protected Shape shape;

    protected int largeur;
    protected int dx, dy;
    protected int x, y;

    static protected int decalage;     //correction bas de fenetre

    protected Dimension coordonnee; // TODO: 2019-03-05  
    protected Dimension vitesse; // TODO: 2019-03-05

    // TODO: 2019-03-14 À remove
//    {
//        //set de la valeur de correction selon l'os
//        if (System.getProperty("os.name").equals("Windows")) {
//            decalage = 40;
//        } else if (System.getProperty("os.name").equals("Mac OS X")) {
//            decalage = 20;
//        } else {
//            decalage = 30;
//        }
//    }

    public Forme() {

        Random alea = new Random();

        largeur = 10 + alea.nextInt(20);

        // Coordonées de départ
        int borneLargeur = Rebond.getInstance().getWidth() - largeur;
        int borneHauteur = Rebond.getInstance().getHeight() - largeur - Rebond.getInstance().decalage();

        x = alea.nextInt(borneLargeur);
        y = alea.nextInt(borneHauteur);

        //vitesse
        dx = 1 + alea.nextInt(6) * (alea.nextBoolean() ? -1 : 1);
        dy = 1 + alea.nextInt(6) * (alea.nextBoolean() ? -1 : 1);
    }

    @Override
    public void move() {
        testLimites();
        x += dx;
        y += dy;
    }

    private void testLimites() {

        if (x + dx < 0) {
            dx *= -1;
        }

        if (x + dx + largeur > Rebond.getInstance().getWidth()) {
            x = Rebond.getInstance().getWidth() - largeur;
            dx *= -1;
        }

        if (y + dy < 0) {
            dy *= -1;
        }

        if (y + dy + largeur > Rebond.getInstance().getHeight() - Rebond.getInstance().decalage()) {
            y = Rebond.getInstance().getHeight() - largeur - Rebond.getInstance().decalage();
            dy *= -1;
        }
    }

    // TODO: 2019-03-14 remove ça
    //public abstract void draw(Graphics g);

    @Override
    public Renderable getRenderer() {
        return renderable;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public Shape getShape() {
        return shape;
    }
}
