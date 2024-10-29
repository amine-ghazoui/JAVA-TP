package exercice_3;

public class LigneCommande {
    private int quantite;
    private Commande commande;
    private Ordinateur ordinateur;

    public LigneCommande(int quantite, Commande commande, Ordinateur ordinateur) {
        this.quantite = quantite;
        this.commande = commande;
        this.ordinateur = ordinateur;
    }

    public int getQuantite() {
        return quantite;
    }

    public Commande getCommande() {
        return commande;
    }

    public Ordinateur getOrdinateur() {
        return ordinateur;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public void setOrdinateur(Ordinateur ordinateur) {
        this.ordinateur = ordinateur;
    }

    @Override
    public String toString() {
        return  "Quantité: " + quantite + "\n" +
                "Commande: " + commande.toString() + "\n" +
                "Ordinateur: " + ordinateur.toString();
    }
}
