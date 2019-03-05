import Formes.Carre;
import Formes.Cercle;
import Formes.Forme;
import Singleton.Rebond;

import java.util.LinkedList;

/**
 * Point d'entrée de l'application
 */
public class LaboRebonds {

    LinkedList<Forme> formes = new LinkedList<>();

    /**
     *
     */
    public LaboRebonds () {
        Rebond.getInstance().setTitle("Appli de rebonds");

        this.ajouteForme();
    }

    /**
     *
     */
    public void ajouteForme () {
        for (int i = 0; i < 10; ++i) {
            formes.add(new Cercle());
            formes.add(new Carre());
        }
    }


    public synchronized void boucle() throws InterruptedException {

        while (true) {

            Rebond.getInstance().repaint();

            for (Forme f : formes) {
                f.dessine(Rebond.getInstance().getGraphics());
                f.translation();
            }

            Thread.sleep(16);

        }


    }

    public static void main (String[] args) {
        try {
            new LaboRebonds().boucle();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
