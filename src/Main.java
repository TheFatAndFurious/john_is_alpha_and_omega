import com.poo.classe.Habitation;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Habitation maison = new Habitation();
        Habitation chez_moi = new Habitation("Home_sweet_home", 80.0, 30.5);
        Habitation chez_ta_soeur = new Habitation("pink_paradise", 80.0, 30.5);
        Habitation chez_ton_pere = new Habitation("la clappe", 80.0, 30.5);

        ArrayList<Habitation> homes = new ArrayList<>();
        homes.add(chez_moi);
        homes.add(chez_ton_pere);
        homes.add(chez_ta_soeur);
        for ( Habitation i : homes) {
            System.out.println(i.get_name() + " a une surface de " + i.surface() + "metres carres");
        }



//        Exemple test = new Exemple();
//        Exemple test_2 = new Exemple("Baro", "Mathieu");
//        System.out.println(test_2.nom + " " +  test_2.prenom);
    }
}