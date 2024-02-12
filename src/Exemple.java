public class Exemple {
    private String nom;
    private String prenom;

    public Exemple(){}

    public Exemple(String last_name, String first_name){
        this.nom = last_name;
        this.prenom = first_name;
    }
    public String get_last_name(){
        return nom.toUpperCase();
    }

    public void set_last_name(String last_name) {
        this.nom = last_name;
    }


}
