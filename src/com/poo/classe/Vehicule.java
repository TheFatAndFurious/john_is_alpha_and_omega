package com.poo.classe;

import org.w3c.dom.ls.LSOutput;

public class Vehicule {

    private String nom;

    private Integer roues;

    private Integer vitesse;

    public Vehicule() {}

    public Vehicule(String nom, Integer roues, Integer vitesse) {
        this.nom = nom;
        this.roues = roues;
        this.vitesse = vitesse;
    }

    public String get_nom() {
        return nom;
    }

    public  Integer get_roues() {
        return roues;
    }

    public Integer get_vitesse() {
        return vitesse;
    }

    public void set_name (String name) {
        this.nom = name;
    }

    public void set_roues (Integer roues) {
        this.roues = roues;
    }

    public void set_vitesse (Integer vitesse) {
        this.vitesse = vitesse;
    }

    public void boost () {
         this.vitesse = this.vitesse + 50;
    }

    public String detect () {
        String vehicule;
        if (this.roues == 4) {
            vehicule = "Voiture";
        } else if (this.roues == 2) {
            vehicule = "Motocyclette";
        } else {
            vehicule =  "Vehicule autre";
        }
        return "Le vehicule est de type: " + vehicule;
        }
    public String plus_rapide ( Vehicule vroum) {
        if ( this.vitesse < vroum.get_vitesse()) {
            return vroum.get_nom() + " " + vroum.get_vitesse();
        } else {
            return this.get_nom() + " " + this.get_vitesse();
        }
    }

    }



