import Fabrique.FabriqueFormeVide;
import Formes.Bouncable;
import Fabrique.FabriqueForme;
import Fabrique.FabriqueFormePlein;
import Formes.Forme;
import Singleton.Rebond;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;

/**
 * Classe de point d'entrée dans l'application
 */
public class BounceApp {

    private LinkedList<Bouncable> bouncers = new LinkedList<>();
    private FabriqueForme fabriquePlein = new FabriqueFormePlein();
    private FabriqueForme fabriqueVide = new FabriqueFormeVide();

    /**
     *
     */
    public BounceApp() {
        Rebond.getInstance().setTitle("Appli de rebonds");
        Rebond.getInstance().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                switch (c) {
                    case 'e':
                        bouncers.clear();
                        break;
                    case 'b':
                        addforme(fabriqueVide);
                        break;
                    case 'f':
                        addforme(fabriquePlein);
                        break;
                    case 'q':
                        System.exit(0);
                }

            }
        });
    }

    private void addforme(FabriqueForme fabriqueForme) {

        bouncers.add(fabriqueForme.creerCercle());
        bouncers.add(fabriqueForme.creerCarre());

    }


    public synchronized void loop() throws InterruptedException {

        while (true) {

            Rebond.getInstance().repaint();
            try {
                for (Bouncable f : bouncers) {
                    f.draw();
                    f.move();
                }
            } catch (ConcurrentModificationException e) {
                //ce try catch permet de regler des problèmes d'accès concurentiel provoquer par des appels succèsif
                //du for each
            }


            Thread.sleep(16);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new BounceApp().loop();
    }
}
