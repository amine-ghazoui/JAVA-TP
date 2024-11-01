package exercice_2;

public class Ingenieur extends Employe{
    private String specialite;

    public Ingenieur(String nom, String prenom, String email, String tele, double salire, String specialite){
        super(nom, prenom, email, tele, salire);
        this.specialite = specialite;
    }

    // Méthode pour calculer le salaire avec un bonus de 15%
    @Override
    public double calculerSalaire(){
        salaire += salaire + salaire * 0.15;
        return salaire;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {

        this.specialite = specialite;
    }

    // Méthode toString pour afficher les informations de l'ingénieur
    @Override
    public String toString() {
        return "Ingénieur:\n" +
                "Nom: " + getNom() + "\n" +
                "Prénom: " + getPrenom() + "\n" +
                "Téléphone: " + getTele() + "\n" +  // Assurez-vous que getTele() est défini
                "Salaire: " + getSalaire() + "\n" +
                "Spécialité: " + specialite + "\n" +
                "********************************";
    }
}
