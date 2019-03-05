package Boites;

import javax.swing.*;
import java.awt.*;

public class Panneau extends JPanel {

    public Panneau(int largPrefere, int hautPrefere) {

        setPreferredSize(new Dimension(largPrefere, hautPrefere));

        setSize(new Dimension(largPrefere, hautPrefere));

    }
}
