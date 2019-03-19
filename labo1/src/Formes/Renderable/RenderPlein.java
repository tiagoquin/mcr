package Formes.Renderable;

import Formes.Bouncable;

import java.awt.*;

public class RenderPlein  implements Renderable {
    @Override
    public void display(Graphics2D g, Bouncable b) {

        g.setColor(b.getColor());
        g.fill(b.getShape());
    }
}
