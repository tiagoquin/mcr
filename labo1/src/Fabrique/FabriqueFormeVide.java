package Fabrique;

import Formes.Vide.CarreVide;
import Formes.Vide.CercleVide;

public class FabriqueFormeVide extends FabriqueForme {

    @Override
    public CarreVide creerCarre() {
        return new CarreVide();
    }

    @Override
    public CercleVide creerCercle() {
        return new CercleVide();
    }
}
