package exercice_3;

import java.io.Serializable;

public class Produit implements Serializable {
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int nombreStock;

    public Produit(String nom, String marque, double prix, String description, int nombreStock) {
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nombreStock = nombreStock;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNombreStock() {
        return nombreStock;
    }

    public void setNombreStock(int nombreStock) {
        this.nombreStock = nombreStock;
    }

    public String toString() {
        return "Produit {" +
                "Nom='" + nom + '\'' +
                ", Marque='" + marque + '\'' +
                ", Prix=" + prix +
                ", Description='" + description + '\'' +
                ", Nombre en Stock=" + nombreStock +
                '}';
    }
}
