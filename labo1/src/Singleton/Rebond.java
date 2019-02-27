package Singleton;

import Boites.Fenetre;
import Boites.Panneau;
import Displayer.Displayer;

import javax.swing.*;
import java.awt.*;

public class Rebond implements Displayer {

    private int hauteur = 800;
    private int largeur = 600;
    private static Rebond instance;

    private Fenetre fenetre = new Fenetre(hauteur, largeur);
    private Panneau panneau;

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
        return 1;
    }

    @Override
    public int getHeight() {
        return 1;
    }

    @Override
    public Graphics2D getGraphics() {
        return null;
    }

    @Override
    public void repaint() {

    }

    @Override
    public void setTitle(String s) {
        fenetre.setTitle(s);
    }
}
