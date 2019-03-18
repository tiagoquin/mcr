package Singleton;

import Boites.Fenetre;
import Boites.Panneau;
import Displayer.Displayer;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.image.BufferedImage;

/**
 * Singleton Rebond. Partie du programme qui contient la fenêtre
 * et qui implémente l'interface fournie Displayer
 */
public class Rebond implements Displayer {

    private static Rebond instance;

    private static final Dimension DIMENSION = new Dimension(800,600);

    private Fenetre fenetre;
    private Panneau panneau;
    private BufferedImage bi;

    /**
     * Constructeur privé du Singleton
     */
    private Rebond () {
        fenetre = new Fenetre(DIMENSION);
        panneau = new Panneau(DIMENSION);

        fenetre.setContentPane(panneau); // On associe notre panneau à la fenêtre

        fenetre.pack(); // Taille de la fenêtre définie par rapport à son panneau
        fenetre.setVisible(true); //Visibilité, important de le faire en dernier

        bi = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bi.createGraphics();
        g2d.drawImage(bi,null,getWidth(),getHeight());
    }

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

    public int decalage() {
        return fenetre.getHeight() - panneau.getHeight();
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

        return (Graphics2D) bi.getGraphics();
    }

    @Override
    public void repaint() {
        panneau.getGraphics().drawImage(bi,0,0, null);
        bi = (BufferedImage) panneau.createImage(getWidth(),getHeight());
    }

    @Override
    public void setTitle(String s) {
        fenetre.setTitle(s);
    }

    @Override
    public void addKeyListener(KeyAdapter ka) {

    }
}
