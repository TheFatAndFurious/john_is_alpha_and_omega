package com.poo.classe;

public class Guerrier extends Personnage{
    private Integer bonus_defense;

    public Guerrier (String nom, Integer vie, Integer defense, Integer attaque, Integer bonus_defense){
        super(nom, vie, attaque, defense);
        this.bonus_defense = bonus_defense;
    }

    public Integer getBonus_defense() {
        return bonus_defense;
    }

    public void setBonus_defense(Integer bonus_defense) {
        this.bonus_defense = bonus_defense;
    }

    public void attaquer(Personnage cible) {
        long bonus_defensif = Math.round(Math.random() * 100);
        if ( bonus_defensif % 20 == 0) {
            this.set_vie(this.get_vie() + this.bonus_defense);
        }
            cible.set_vie(cible.get_vie() - this.get_attaque() + cible.get_defense());
    }
}
