package Fabrique;

import Formes.Plein.CarrePlein;
import Formes.Plein.CerclePlein;

public class FabriqueFormePlein extends FabriqueForme {

    @Override
    public CarrePlein creerCarre() {
        return new CarrePlein();
    }

    @Override
    public CerclePlein creerCercle() {
        return new CerclePlein();
    }
}
