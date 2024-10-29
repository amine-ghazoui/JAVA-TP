package exercice_2;

public abstract class Employe {
    protected String nom;
    protected String prenom;
    protected String email;
    protected String tele;
    protected double salaire;

    public Employe(){

    }

    public Employe(String nom, String prenom, String email, String tele, double salire){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tele = tele;
        this.salaire = salire;
    }

    public abstract double calculerSalire();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
