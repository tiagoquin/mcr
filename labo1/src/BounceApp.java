import Displayer.Bouncable;
import Fabrique.FabriqueForme;
import Fabrique.FabriqueFormePlein;
import Formes.Forme;
import Singleton.Rebond;

import java.util.LinkedList;

/**
 * Classe de point d'entrée dans l'application
 */
public class BounceApp {

    // TODO: 2019-03-13
    private LinkedList<Bouncable> bouncers = new LinkedList<>();
    private LinkedList<Forme> formes = new LinkedList<>();

    /**
     *
     */
    public BounceApp() {
        Rebond.getInstance().setTitle("Appli de rebonds");

        this.ajouteForme();
    }

    /**
     * Ajoute à une liste nos formes
     */
    public void ajouteForme() {

        FabriqueForme ff = new FabriqueFormePlein();

        for (int i = 0; i < 50; ++i) {
            formes.add(ff.creerCarre());
            formes.add(ff.creerCercle());
        }
    }

    public synchronized void loop() throws InterruptedException {

        while (true) {

            Rebond.getInstance().repaint();

            for (Forme f : formes) {
                f.draw(Rebond.getInstance().getGraphics());
                f.translation();
            }

            Thread.sleep(16);
        }
    }

    public static void main(String[] args) {
        try {
            new BounceApp().loop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
