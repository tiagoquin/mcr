package Singleton;

import javax.swing.*;

public class Fenetre extends JFrame {

    private static Fenetre instance;

    private final int LARGEUR = 800;
    private final int HAUTEUR = 600;

    /**
     * Constructeur privé du Singleton
     */
    private Fenetre () {}

    //

    public int getLARGEUR() {
        return LARGEUR;
    }

    public int getHAUTEUR() {
        return HAUTEUR;
    }

    public static synchronized Fenetre getInstance() {
        if (instance == null) {
            instance = new Fenetre();
        }

        return instance;
    }


}
