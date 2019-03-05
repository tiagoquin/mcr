package Boites;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Fenetre extends JFrame {

    public Fenetre(int largeur, int hauteur) {

        this.setMinimumSize(new Dimension(largeur / 4, hauteur / 4));
        this.setBackground(Color.LIGHT_GRAY);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Comportement en fermeture

    }
}
