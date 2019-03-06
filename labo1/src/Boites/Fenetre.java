package Boites;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Color;

public class Fenetre extends JFrame {

    public Fenetre(Dimension dimension) {

        this.setMinimumSize(new Dimension(dimension.width / 4, dimension.height / 4));
        this.setBackground(Color.WHITE);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Comportement en fermeture

    }
}
