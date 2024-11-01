package exercice_3;

import java.util.ArrayList;

public class Categorer {
    private String nom;
    private String description;
    private ArrayList<Ordinateur> ordinateur;

    public Categorer() {
    }

    public Categorer(String nom, String description) {
        this.nom = nom;
        this.description = description;
        this.ordinateur = new ArrayList<>();
    }

    public void ajouterOrdinateur(Ordinateur pc){
        for (Ordinateur ordinateur1 : ordinateur) {
            if (ordinateur1.equals(pc)){
                System.out.println("l'ordinateur est déja existe !");
            }
            else {
                ordinateur.add(pc);
            }
        }
    }

    public void supprimerOrdinateur(Ordinateur pc){
        for (Ordinateur ordinateur1 : ordinateur) {
            if (!ordinateur1.equals(pc)){
                System.out.println("l'ordinateur n'est pas trouver !");
            }
            else {
                ordinateur.remove(ordinateur1);
            }
        }
    }

    public ArrayList<Ordinateur> rechercherParPrix(double prix){
        ArrayList<Ordinateur> ord = new ArrayList<>();
        for (Ordinateur ordinateur1 : ordinateur) {
            if (ordinateur1.getPrix() == prix){
                ord.add(ordinateur1);
            }
        }
        return ord;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Ordinateur> getOrdinateur() {
        return ordinateur;
    }

    public void setOrdinateur(ArrayList<Ordinateur> ordinateur) {
        this.ordinateur = ordinateur;
    }

    @Override
    public String toString() {
        return  "\n : " + nom + "\n" +
                "Description: " + description + "\n" +
                "Ordinateurs: " + ordinateur.toString() + "\n";
    }
}
