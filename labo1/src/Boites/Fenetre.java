package Boites;

import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {

    public Fenetre(int largeurMin, int hauteurMin) {

        this.setMinimumSize(new Dimension(largeurMin / 4, hauteurMin / 4));


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Comportement en fermeture

        this.pack();
        this.setVisible(true);
    }

}
