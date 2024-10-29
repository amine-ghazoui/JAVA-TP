package exercice_3;

import java.util.ArrayList;

public class Client {
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String ville;
    private String tele;
    private ArrayList<Commande> commande;

    public Client() {
    }

    public Client(String nom, String prenom, String email, String adresse, String ville, String tele) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.ville = ville;
        this.commande = new ArrayList<>();
        this.tele = tele;
    }

    public void ajouterCommande(Commande cmd){
        if (commande.equals(cmd)){
            System.out.println("la commande est déja existe !");
        }
        else{
            commande.add(cmd);
        }
    }

    public void supprimerCommande(Commande cmd){
        for (Commande commande1 : commande) {
            if (commande1.equals(cmd)){
                commande.remove(cmd);
            }
        }
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public ArrayList<Commande> getCommande() {
        return commande;
    }

    public void setCommande(ArrayList<Commande> commande) {
        this.commande = commande;
    }

    @Override
    public String toString() {
        return  "Nom : " + nom + "\n" +
                "Prénom : " + prenom + "\n" +
                "Email : " + email + "\n" +
                "Adresse : " + adresse + "\n" +
                "Ville : " + ville + "\n" +
                "Téléphone : " + tele + "\n";
                //"Commandes : " + commande.toString();
    }
}
