package exercice_4;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetierProduit{

    private List<Produit> produits;

    public MetierProduitImpl() {
        this.produits = new ArrayList<>();
    }

    @Override
    public Produit add(Produit p) {
        if (produits.contains(p) == true){
            System.out.println("le produit est déja existe dans la liste des produits ");
        }
        else {
            produits.add(p);
        }
        return p;
    }

    @Override
    public List<Produit> getAll() {
        if (produits.isEmpty()){
            System.out.println("La liste des produits est vide.");
        }
        return produits;
    }

    @Override
    public List<Produit> findByNom(String motCle) {
        List<Produit> produit = new ArrayList<>();

        for (Produit produit1 : produits) {
            if(produit1.getNom().equals(motCle)){
                produit.add(produit1);
            }
        }
        return produit;
    }

    @Override
    public Produit findById(long id) {
        Produit produit = null;
        for (Produit produit1 : produits) {
            if (produit1.getId() == id){
                produit = produit1;
            }
        }
        if (produit.equals(null)){
            System.out.println("le produit n'exist pas !!");
        }
        return produit;
    }

    @Override
    public void delete(long id) {
        for (Produit produit : produits) {
            if (produit.getId() == id){
                produits.remove(produit);
            }
        }
        System.out.println("Le produit a été supprimé.");
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void afficherOperation(){
        System.out.println("--------------MENU----------------");
        System.out.println("1. Afficher la liste des produits.");
        System.out.println("2. Rechercher des produits par mot clé.");
        System.out.println("3. Ajouter un nouveau produit dans la liste.");
        System.out.println("4. Récupérer et afficher un produit par ID.");
        System.out.println("5. Supprimer un produit par id.");
    }

    @Override
    public String toString() {
        return produits.toString();
    }
}
