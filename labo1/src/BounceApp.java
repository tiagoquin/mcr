import Fabrique.FabriqueFormeVide;
import Formes.Bouncable;
import Fabrique.FabriqueForme;
import Fabrique.FabriqueFormePlein;
import Formes.Forme;
import Singleton.Rebond;

import java.util.LinkedList;

/**
 * Classe de point d'entrée dans l'application
 */
public class BounceApp {

    private LinkedList<Bouncable> bouncers = new LinkedList<>();

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

        FabriqueForme fabriquePlein = new FabriqueFormePlein();
        FabriqueForme fabriqueVide = new FabriqueFormeVide();

        for (int i = 0; i < 10; ++i) {
            bouncers.add(fabriquePlein.creerCarre());
            bouncers.add(fabriquePlein.creerCercle());
            bouncers.add(fabriqueVide.creerCarre());
            bouncers.add(fabriqueVide.creerCercle());
        }
    }

    public synchronized void loop() throws InterruptedException {

        while (true) {

            Rebond.getInstance().repaint();

            for (Bouncable f : bouncers) {
                f.draw();
                f.move();
            }

            Thread.sleep(16);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new BounceApp().loop();
    }
}
