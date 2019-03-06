import Formes.Carre;
import Formes.Cercle;
import Formes.Forme;
import Singleton.Rebond;

import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Classe de point d'entrée dans l'application
 */
public class LaboRebonds extends TimerTask {

   private LinkedList<Forme> formes = new LinkedList<>();

    /**
     *
     */
    public LaboRebonds() {
        Rebond.getInstance().setTitle("Appli de rebonds");

        this.ajouteForme();
    }

    /**
     * Ajoute à une liste nos formes
     */
    public void ajouteForme() {
        for (int i = 0; i < 50; ++i) {
            formes.add(new Cercle());
            formes.add(new Carre());
        }
    }

    /**
     * l'appel a cette fonction peu être gérer via Timertask
     */
    @Override
    public void run() {
        Rebond.getInstance().repaint();

        for (Forme f : formes) {
            f.dessine(Rebond.getInstance().getGraphics());
            f.translation();
        }
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new LaboRebonds(), 0, 50);
    }
}
