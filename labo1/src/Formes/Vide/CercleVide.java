package Formes.Vide;

import Formes.Forme;
import Formes.Renderable.RenderVide;
import Singleton.Rebond;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CercleVide extends Forme {

    public CercleVide () {
        // TODO: 18.03.19 Maybe remove that
        //this.shape = new Rectangle2D.Double (this.x, this.y, this.largeur, this.largeur);
        this.renderable = new RenderVide();
        this.color = Color.PINK;
    }

    @Override
    public void draw() {
        getRenderer().display(Rebond.getInstance().getGraphics(), this);
    }

    @Override
    public Shape getShape() {
        return new Ellipse2D.Double (this.x, this.y, this.largeur, this.largeur);
    }
}
