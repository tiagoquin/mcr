package Boites;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Fenetre extends JFrame {

    private Panneau panneau;
    private BufferedImage buffer;

    public Fenetre(int largeur, int hauteur) {

        this.setMinimumSize(new Dimension(largeur / 4, hauteur / 4));
        this.setBackground(Color.LIGHT_GRAY);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Comportement en fermeture

        panneau = new Panneau(largeur, hauteur);

        this.setContentPane(panneau); // On associe notre panneau à la fenêtre

        this.pack(); // Taille de la fenêtre définie par rapport à son panneau
        this.setVisible(true); //Visibilité, important de le faire en dernier
    }

    public Panneau getPanneau() {
        return panneau;
    }



}
