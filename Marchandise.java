package com.cargaison.Cargaison;

public class Marchandise {
    private int numero;
    private double poids;
    private double volume;

    public Marchandise(int numero, double poids, double volume) {
        this.numero = numero;
        this.poids = poids;
        this.volume = volume;
    }

    public int getNumero() {
        return numero;
    }

    public double getPoids() {
        return poids;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Marchandise [Numéro=" + numero + ", Poids=" + poids + " kg, Volume=" + volume + " m3]";
    }
}
