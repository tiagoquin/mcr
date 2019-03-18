package Formes.Vide;

import Formes.Forme;
import Formes.Renderable.RenderVide;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CercleVide extends Forme {

    public CercleVide() {
        this.renderable = new RenderVide();
        this.color = Color.PINK;
    }

    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(this.x, this.y, this.largeur, this.largeur);
    }
}
