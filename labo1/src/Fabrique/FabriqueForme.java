package Fabrique;

import Formes.CarrePlein;
import Formes.CerclePlein;

public abstract class FabriqueForme {

    public abstract CarrePlein creerCarre();

    public abstract CerclePlein creerCercle();
}
