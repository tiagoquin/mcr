import Fabrique.FabriqueFormeVide;
import Formes.Bouncable;
import Fabrique.FabriqueForme;
import Fabrique.FabriqueFormePlein;
import Formes.Forme;
import Singleton.Rebond;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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

               switch (c){
                   case 'e':
                       bouncers.clear();
                       break;
                   case 'b':
                       bouncers.add(fabriqueVide.creerCercle());
                       bouncers.add(fabriqueVide.creerCarre());
                       break;
                   case 'f':
                       bouncers.add(fabriquePlein.creerCarre());
                       bouncers.add(fabriquePlein.creerCercle());
                       break;
                   case 'q':
                       System.exit(0);
               }

            }
        });

        this.ajouteForme();
    }

    /**
     * Ajoute à une liste nos formes
     */
    public void ajouteForme() {



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
