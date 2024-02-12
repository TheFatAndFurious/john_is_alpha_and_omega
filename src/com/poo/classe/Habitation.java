package com.poo.classe;

public class Habitation {

    private String nom;

    private double longueur;
    private double largeur;

    public Habitation() {}

    public Habitation( String name, Double length, Double width) {
        this.nom = name;
        this.longueur = length;
        this.largeur = width;
    }

    public String get_name() {
        return nom;
    }

    public Double get_longueur() {
        return longueur;
    }

    public Double get_largeur() {
        return largeur;
    }

    public void set_name(String nom) {
        this.nom = nom;
    }

    public void set_longueur(Double longueur) {
        this.longueur = longueur;
    }

    public void set_largeur(Double largeur) {
        this.largeur = largeur;
    }

    public Double surface() {
        Double area = this.largeur * this.longueur;
        return area;
    }


}
