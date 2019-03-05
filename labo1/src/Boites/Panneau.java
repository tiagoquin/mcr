package Boites;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Panneau extends JPanel {

    public Panneau(int largPrefere, int hautPrefere) {

        this.setPreferredSize(new Dimension(largPrefere, hautPrefere));

        this.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g); //Obligatoire au début

        g.setColor(Color.blue);
        g.fillRect(5,5,10,10);

    }

}

// TODO: 2019-02-27 pour l'instant cette classe sert à rien je crois