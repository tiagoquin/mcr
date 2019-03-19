package Formes.Vide;

import Formes.Forme;
import Formes.Renderable.RenderVide;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class CarreVide extends Forme {

    public CarreVide () {

        this.renderable = new RenderVide();
        this.color = Color.green;
    }

    @Override
    public Shape getShape() {
        return new Rectangle2D.Double (this.x, this.y, this.largeur, this.largeur);
    }

}
