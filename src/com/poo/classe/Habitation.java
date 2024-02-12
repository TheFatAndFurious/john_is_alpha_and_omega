package com.poo.classe;

public class Habitation {

    private String nom;

    private Double longueur;
    private Double largeur;

    private Integer nombre_etages;

    public Habitation() {}

    public Habitation( String name, Double length, Double width, Integer nombre_etages) {
        this.nom = name;
        this.longueur = length;
        this.largeur = width;
        this.nombre_etages = nombre_etages;
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

    public Integer get_nombre_etages() {
        return nombre_etages;
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

    public void set_nombre_etages(Integer nombre_etages) {
        this.nombre_etages = nombre_etages;
    }

    public Double surface() {
        return this.largeur * this.longueur * this.nombre_etages;
    }


}
