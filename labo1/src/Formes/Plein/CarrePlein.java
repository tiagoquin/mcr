package Formes.Plein;

import Formes.Forme;
import Formes.Renderable.RenderPlein;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class CarrePlein extends Forme {

    public CarrePlein () {
        this.renderable = new RenderPlein();
        this.color = Color.ORANGE;
        this.shape = new Rectangle2D.Double (this.x, this.y, this.largeur, this.largeur);
    }


    @Override
    public void move() {
        super.move();

        ((Rectangle2D.Double) this.shape).setFrame(this.x, this.y, this.largeur, this.largeur);
    }
}


