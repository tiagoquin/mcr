package Formes;

import Singleton.Rebond;

public class CerclePlein extends Forme {

//    public void draw(Graphics g) {
//
//        Graphics2D g2d = (Graphics2D) g;
//
//        g2d.setColor(Color.PINK);
//
//        g2d.fillOval(x, y, largeur, largeur);
//    }

    @Override
    public void draw() {

        getRenderer().display(Rebond.getInstance().getGraphics(), this);
    }
}
