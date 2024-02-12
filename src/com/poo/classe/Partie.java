package com.poo.classe;

public class Partie {
    private Personnage joueur_1;
    private Personnage joueur_2;
    private int nombre_tour;

    public Personnage getJoueur_1() {
        return joueur_1;
    }

    public void setJoueur_1(Personnage joueur_1) {
        this.joueur_1 = joueur_1;
    }

    public Personnage getJoueur_2() {
        return joueur_2;
    }

    public void setJoueur_2(Personnage joueur_2) {
        this.joueur_2 = joueur_2;
    }

    public int getNombre_tour() {
        return nombre_tour;
    }

    public void setNombre_tour(int nombre_tour) {
        this.nombre_tour = nombre_tour;
    }

    public Partie(Personnage player_1, Personnage player_2, Integer nombre_tour){
        this.joueur_1 = player_1;
        this.joueur_2 = player_2;
        this.nombre_tour = nombre_tour;
    }

    public String lancer_partie() {
        String message = " ";
        while (this.nombre_tour > 0) {
            this.joueur_1.attaquer(this.joueur_2);
            System.out.println("vie joueur 2: " + this.joueur_2.get_vie());
            this.joueur_2.attaquer(this.joueur_1);
            System.out.println("vie joueur 1: " + this.joueur_1.get_vie());
            if (this.joueur_1.get_vie() < 1) {
               return message = "Victoire de " + this.joueur_2.get_nom();
            } else if ( this.joueur_2.get_vie() < 1) {
               return message = "Victoire de " + this.joueur_1.get_nom();
            }
            this.nombre_tour --;
            System.out.println(this.nombre_tour);
        }
        return message;
    }

}
