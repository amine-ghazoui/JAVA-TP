package exercice_1;

public class Auteur extends Personne{
    private int numAuteur;

    public Auteur(String nom, String prenom, String email, String tele, int age, int numAuteur){
        super(nom, prenom, email, tele, age);
        this.numAuteur = numAuteur;
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.println("numéro auteur : "+numAuteur);
    }

    public int getNumAuteur() {

        return numAuteur;
    }

    public void setNumAuteur(int numAuteur) {

        this.numAuteur = numAuteur;
    }
}
