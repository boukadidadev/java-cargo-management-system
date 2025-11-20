package com.cargaison.Cargaison;
public class CargaisonAerienne extends Cargaison {

    public CargaisonAerienne(double distance) {
        super(distance);
    }

    @Override
    public double calculerCout() {
        double poidsTotal = poidsTotal();
        double volumeTotal = volumeTotal();
        if (volumeTotal < 80000) {
            return 10 * distance * poidsTotal;
        } else {
            return 12 * distance * poidsTotal;
        }
    }

    @Override
    public String toString() {
        return "Cargaison Aérienne [Distance=" + distance + " km]";
    }
}
