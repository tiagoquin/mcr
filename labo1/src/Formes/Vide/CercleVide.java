package Formes.Vide;

import Formes.Forme;
import Formes.Renderable.RenderVide;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CercleVide extends Forme {

    public CercleVide() {
        this.renderable = new RenderVide();
        this.color = Color.PINK;
        this.shape = new Ellipse2D.Double(this.x, this.y, this.largeur, this.largeur);
    }


    @Override
    public void move() {
        super.move();
        ((Ellipse2D.Double) this.shape).setFrame(this.x, this.y, this.largeur, this.largeur);
    }
}
