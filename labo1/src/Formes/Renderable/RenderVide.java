package Formes.Renderable;

import Formes.Bouncable;

import java.awt.*;

public class RenderVide implements Renderable {
    @Override
    public void display(Graphics2D g, Bouncable b) {

        g.setColor(b.getColor());
        g.setStroke(new BasicStroke(3));
        g.draw(b.getShape());
    }
}
