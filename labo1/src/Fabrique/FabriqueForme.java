package Fabrique;

import Formes.Bouncable;
import Formes.Plein.CarrePlein;
import Formes.Plein.CerclePlein;

public abstract class FabriqueForme {

    public abstract Bouncable creerCarre();

    public abstract Bouncable creerCercle();
}
