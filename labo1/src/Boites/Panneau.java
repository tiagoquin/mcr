package Boites;

import javax.swing.*;
import java.awt.*;

public class Panneau extends JPanel {

    public Panneau(int largPrefere, int hautPrefere) {

        setPreferredSize(new Dimension(largPrefere, hautPrefere));

        setSize(new Dimension(largPrefere, hautPrefere));

        setBackground(Color.WHITE);

        // Création d'une image
        creerImage();

    }

    private void creerImage () {

    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g); //Obligatoire au début
    }

}

// TODO: 2019-02-27 pour l'instant cette classe sert à rien je crois