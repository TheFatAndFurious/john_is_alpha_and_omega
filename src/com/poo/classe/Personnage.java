package com.poo.classe;

public class Personnage {
    private String nom;
    private Integer vie;
    private Integer attaque;
    private Integer defense;

    public Personnage(){};

    public Personnage(String nom, Integer vie, Integer attaque, Integer defense) {
        this.nom = nom;
        this.vie = vie;
        this.attaque = attaque;
        this.defense = defense;
    }


    public String get_nom() {
        return nom;
    }

    public Integer get_vie() {
        return vie;
    }

    public Integer get_attaque() {
        return attaque;
    }

    public Integer get_defense() {
        return defense;
    }

    public void set_nom(String nom) {
        this.nom = nom;
    }

    public void set_attaque(Integer attaque) {
        this.attaque = attaque;
    }

    public void set_defense(Integer defense) {
        this.defense = defense;
    }

    public void set_vie(Integer vie) {
        this.vie = vie;
    }

    public void attaquer(Personnage cible) {
        cible.vie = cible.vie - (this.attaque - cible.defense);
    }
}
