package exercice_3;

import java.io.Serializable;

public class Client implements Serializable {
    private String nom;
    private String prenom;
    private String adresse;
    private String tele;
    private String email;

    public Client(String nom, String prenom, String adresse, String tele, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tele = tele;
        this.email = email;
    }

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

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Client {" +
                "Nom='" + nom + '\'' +
                ", Prénom='" + prenom + '\'' +
                ", Adresse='" + adresse + '\'' +
                ", Téléphone='" + tele + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}
