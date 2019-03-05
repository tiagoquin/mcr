package Boites;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Color;

public class Fenetre extends JFrame {

    public Fenetre(int largeur, int hauteur) {

        this.setMinimumSize(new Dimension(largeur / 4, hauteur / 4));
        this.setBackground(Color.WHITE);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Comportement en fermeture

    }
}
