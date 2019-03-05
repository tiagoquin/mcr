package Boites;

import Singleton.Rebond;

import java.awt.*;
import java.awt.image.BufferedImage;

public class BufferDessin extends BufferedImage {

    public BufferDessin() {
        super(Rebond.getInstance().getWidth(), Rebond.getInstance().getWidth(), BufferedImage.TYPE_INT_RGB);
    }
}
