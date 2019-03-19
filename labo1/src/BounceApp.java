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
        int nombreFabriquerParPression = 10;
        for (int i = 0; i < nombreFabriquerParPression; i++) {
            bouncers.add(fabriqueForme.creerCercle());
            bouncers.add(fabriqueForme.creerCarre());
        }

    }


    public synchronized void loop() throws InterruptedException {

        while (true) {

            Rebond.getInstance().repaint();
            try { //n.b: ce try catch est inutile si on Utilise un Timer pour dessiner les forme mais la donner ne nous
                //le permet pas on pourrait aussi utiliser autre chose que Keypressed
                for (Bouncable f : bouncers) {
                    f.draw();
                    f.move();
                }
            } catch (ConcurrentModificationException e) {
                //ce try catch permet de regler des problèmes d'accès concurentiel provoquer par des appels succèsif
                //du for each
            } catch (NullPointerException e){
                //regle les probleme lorsqu'on clear et qu
            }

            Thread.sleep(16);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new BounceApp().loop();
    }
}
