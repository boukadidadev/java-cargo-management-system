package com.cargaison.Cargaison;

public class CargaisonRoutiere extends Cargaison {

    public CargaisonRoutiere(double distance) {
        super(distance);
    }

    @Override
    public double calculerCout() {
        double poidsTotal = poidsTotal();
        double volumeTotal = volumeTotal();
        if (volumeTotal < 380000) {
            return 4 * distance * poidsTotal;
        } else {
            return 6 * distance * poidsTotal;
        }
    }

    @Override
    public String toString() {
        return "Cargaison Routière [Distance=" + distance + " km]";
    }
}
