import Formes.Carre;
import Formes.Cercle;
import Formes.Forme;
import Singleton.Rebond;

import java.util.LinkedList;

/**
 * Classe de point d'entrée dans l'application
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
     * Ajoute à une liste nos formes
     */
    public void ajouteForme () {
        for (int i = 0; i < 50; ++i) {
            formes.add(new Cercle());
            formes.add(new Carre());
        }
    }


    /**
     * Contrôle le rafraichissement de la fenêtre et des formes.
     * @throws InterruptedException Peut lever cette exception à cause du synchronized
     */
    public synchronized void boucle() throws InterruptedException {

        while (true) {

            Rebond.getInstance().repaint();

            for (Forme f : formes) {
                f.dessine(Rebond.getInstance().getGraphics());
                f.translation();
            }

            Thread.sleep(20);
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
