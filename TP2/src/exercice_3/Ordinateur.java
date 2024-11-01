package exercice_3;

public class Ordinateur {
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int nbrEnStock;

    public Ordinateur(String nom, String marque, double prix, String description, int nbrEnStock) {
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nbrEnStock = nbrEnStock;
    }

    public double prixOrdinateur(int quantite){
        prix = prix * quantite;
        return prix;
    }

    public String getNom() {
        return nom;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public int getNbrEnStock() {
        return nbrEnStock;
    }

    public String getDescription() {
        return description;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setNbrEnStock(int nbrEnStock) {
        this.nbrEnStock = nbrEnStock;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  "\n Nom: " + nom + "\n" +
                "Marque: " + marque + "\n" +
                "Prix: " + prix + "DH" + "\n" +
                "Description: " + description + "\n" +
                "Nombre en stock: " + nbrEnStock;
    }
}
