package Singleton;

import Boites.Fenetre;
import Displayer.Displayer;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Singleton Rebond. Partie du programme qui contient la fenêtre
 * et qui implémente l'interface fournie Displayer
 */
public class Rebond implements Displayer {

    private static Rebond instance;

    private final int HAUTEUR_DEFAUT = 800;
    private final int LARGEUR_DEFAUT = 600;

    private Fenetre fenetre = new Fenetre(HAUTEUR_DEFAUT, LARGEUR_DEFAUT);

    /**
     * Constructeur privé du Singleton
     */
    private Rebond () {}

    //

    /**
     * @return l'unique instance de Fenetre
     */
    public static synchronized Rebond getInstance() {
        if (instance == null) {
            instance = new Rebond();
        }

        return instance;
    }

    @Override
    public int getWidth() {
        return fenetre.getWidth();
    }

    @Override
    public int getHeight() {
        return fenetre.getHeight();
    }

    @Override
    public Graphics2D getGraphics() {


        return (Graphics2D) fenetre.getPanneau().getGraphics();
    }

    @Override
    public void repaint() {
        fenetre.repaint();
    }

    @Override
    public void setTitle(String s) {
        fenetre.setTitle(s);
    }
}
