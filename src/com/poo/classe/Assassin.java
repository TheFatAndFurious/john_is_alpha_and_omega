package com.poo.classe;

public class Assassin extends Personnage{
    private Integer bonus_attaque;

    public Assassin(String nom, Integer vie, Integer attaque, Integer defense, Integer bonus_attaque) {
        super(nom, vie, attaque, defense);
        this.bonus_attaque = bonus_attaque;
    }

    public Integer getBonus_attaque() {
        return bonus_attaque;
    }

    public void setBonus_attaque(Integer bonus_attaque) {
        this.bonus_attaque = bonus_attaque;
    }

    public void attaquer(Personnage cible) {
        long hasard = Math.round(Math.random() * 100);
        if( hasard % 20 == 0) {
            System.out.println("bonus attaque");
            cible.set_vie(cible.get_vie() - (this.get_attaque() + this.getBonus_attaque() - cible.get_defense()));
        } else {
            cible.set_vie(cible.get_vie() - (this.get_attaque() - cible.get_defense()));
        }
    }
}
