package Formes.Vide;

import Formes.Forme;
import Formes.Renderable.RenderVide;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class CarreVide extends Forme {

    public CarreVide () {

        this.renderable = new RenderVide();
        this.color = Color.green;
        this.shape = new Rectangle2D.Double (this.x, this.y, this.largeur, this.largeur);
    }


    @Override
    public void move() {
        super.move();

        ((Rectangle2D.Double) this.shape).setFrame(this.x, this.y, this.largeur, this.largeur);
    }

}
