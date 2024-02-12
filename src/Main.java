import com.poo.classe.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Habitation maison = new Habitation();
        Habitation chez_moi = new Habitation("Home_sweet_home", 30.0, 30.5, 3);
        Habitation chez_ta_soeur = new Habitation("pink_paradise", 50.0, 30.5, 4);
        Habitation chez_ton_pere = new Habitation("la clappe", 80.0, 30.5, 4);

        ArrayList<Habitation> homes = new ArrayList<>();
        homes.add(chez_moi);
        homes.add(chez_ton_pere);
        homes.add(chez_ta_soeur);
        for ( Habitation i : homes) {
            System.out.println(i.get_name() + " a une surface de " + i.surface() + " " +
                    "metres carres");
        }


        Vehicule vroum = new Vehicule();
        Vehicule porshe = new Vehicule("Cayman", 4, 230);
        Vehicule fiat = new Vehicule("Uno", 4, 90);
        Vehicule ducatti = new Vehicule("Street_racer", 2, 280);

        System.out.println(ducatti.detect());

        ArrayList<Vehicule> vehicles = new ArrayList<>();
        vehicles.add(porshe);
        vehicles.add(fiat);
        vehicles.add(ducatti);
        for ( Vehicule i : vehicles ) {
            System.out.println(i.get_nom() + " =>> " + i.detect() + " et atteint la vitesse de " + i.get_vitesse());

        }

        for ( Vehicule j : vehicles) {
            j.boost();
            System.out.println(j.get_nom() + " atteint maintenant la vitesse de " + j.get_vitesse());
        }

        System.out.println("le vehicule le plus rapide est : " + porshe.plus_rapide(fiat));
        System.out.println("le vehicule le plus rapide est : " + fiat.plus_rapide(ducatti));
        System.out.println("le vehicule le plus rapide est : " + ducatti.plus_rapide(porshe));

        Personnage Jonhatan = new Personnage("John", 100, 2, 5);
        Personnage MathieuPHP = new Personnage( "Matt", 100, 30, 5);

        System.out.println(Jonhatan.get_vie());

        MathieuPHP.attaquer(Jonhatan);

        System.out.println(Jonhatan.get_vie());

        Personnage Babakar = new Assassin("Babakar", 100, 15, 5, 10);

        Personnage Abdoul = new Guerrier("Abdoul", 100, 8, 10, 10);

//        for (int I = 0; I < 150; I++) {
//            Babakar.attaquer(Jonhatan);
//            System.out.println(Jonhatan.get_vie());
//            Jonhatan.set_vie(100);
//        }

//        for (int I = 0; I < 150; I++) {
//            Abdoul.attaquer(Jonhatan);
//            System.out.println(Abdoul.get_vie());
//            Abdoul.set_vie(100);
//        }

        Partie nouvelle = new Partie(Babakar, Abdoul, 20);
        System.out.println(nouvelle.lancer_partie());

//        Exemple test = new Exemple();
//        Exemple test_2 = new Exemple("Baro", "Mathieu");
//        System.out.println(test_2.nom + " " +  test_2.prenom);
    }
}