package Boites;

import javax.swing.JPanel;
import java.awt.Dimension;

public class Panneau extends JPanel {

    public Panneau(int largPrefere, int hautPrefere) {

        setPreferredSize(new Dimension(largPrefere, hautPrefere));

        setSize(new Dimension(largPrefere, hautPrefere));

    }
}
