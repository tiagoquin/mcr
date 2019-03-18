package Renderable;

import Displayer.Bouncable;

import java.awt.*;

public class RenderPlein  implements Renderable{
    @Override
    public void display(Graphics2D g, Bouncable b) {
        b.draw();
    }
}
