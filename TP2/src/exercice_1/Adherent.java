package exercice_1;

public class Adherent extends Personne{
    private int numAdherent;

    public Adherent(String nom, String prenom, String email, String tele, int age, int numAdherent){
        super(nom, prenom, email, tele, age);
        this.numAdherent = numAdherent;
    }

    // Méthode pour afficher les informations de l'adhérent
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("numéro d'adherent : "+numAdherent);
    }

    public int getNumAdherent() {

        return numAdherent;
    }

    public void setNumAdherent(int numAdherent) {

        this.numAdherent = numAdherent;
    }
}
