package Formes.Plein;

import Formes.Forme;
import Formes.Renderable.RenderPlein;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CerclePlein extends Forme {

    public CerclePlein () {
        this.renderable = new RenderPlein();
        this.color = Color.BLUE;
        this.shape = new Ellipse2D.Double(this.x, this.y, this.largeur, this.largeur);
    }


    @Override
    public void move() {
        super.move();
        ((Ellipse2D.Double) this.shape).setFrame(this.x, this.y, this.largeur, this.largeur);
    }
}
