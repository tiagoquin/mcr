package Formes.Plein;

import Formes.Forme;
import Formes.Renderable.RenderPlein;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class CarrePlein extends Forme {

    public CarrePlein () {
        this.renderable = new RenderPlein();
        this.color = Color.ORANGE;
    }

    @Override
    public Shape getShape() {
        return new Rectangle2D.Double (this.x, this.y, this.largeur, this.largeur);
    }
}


