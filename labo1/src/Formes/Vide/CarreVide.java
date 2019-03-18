package Formes.Vide;

import Formes.Forme;
import Formes.Renderable.RenderPlein;
import Formes.Renderable.RenderVide;
import Singleton.Rebond;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class CarreVide extends Forme {

    public CarreVide () {
        // TODO: 18.03.19 Maybe remove that
        //this.shape = new Rectangle2D.Double (this.x, this.y, this.largeur, this.largeur);
        this.renderable = new RenderVide();
        this.color = Color.green;
    }

    @Override
    public void draw() {
        getRenderer().display(Rebond.getInstance().getGraphics(), this);
    }

    @Override
    public Shape getShape() {
        return new Rectangle2D.Double (this.x, this.y, this.largeur, this.largeur);
    }

}
