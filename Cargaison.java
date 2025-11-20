package com.cargaison.Cargaison;

import java.util.ArrayList;
import java.util.List;

public abstract class Cargaison {
    protected double distance;
    protected List<Marchandise> marchandises = new ArrayList<>();

    public Cargaison(double distance) {
        this.distance = distance;
    }

    public void ajouterMarchandise(Marchandise m) {
        marchandises.add(m);
    }

    public void afficherMarchandises() {
        for (Marchandise m : marchandises) {
            System.out.println(m);
        }
    }

    public Marchandise consulterMarchandise(int numero) throws Exception {
        for (Marchandise m : marchandises) {
            if (m.getNumero() == numero) {
                return m;
            }
        }
        throw new Exception("Marchandise introuvable");
    }

    public double volumeTotal() {
        double total = 0;
        for (Marchandise m : marchandises) {
            total += m.getVolume();
        }
        return total;
    }

    public double poidsTotal() {
        double total = 0;
        for (Marchandise m : marchandises) {
            total += m.getPoids();
        }
        return total;
    }

    public abstract double calculerCout();

    @Override
    public String toString() {
        return "Cargaison [Distance=" + distance + " km]";
    }
}

