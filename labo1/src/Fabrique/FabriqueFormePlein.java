package Fabrique;

import Formes.CarrePlein;
import Formes.CerclePlein;

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
