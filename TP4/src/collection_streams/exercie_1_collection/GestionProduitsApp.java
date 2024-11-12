package collection_streams.exercie_1_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionProduitsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produit> produit = new ArrayList<>();

        // Créer 3 produits
        Produit p1 = new Produit(12, "Ordinateur", 5000);
        Produit p2 = new Produit(13, "imprimente", 1000);
        Produit p3 = new Produit(14, "Telephone", 2500);

        // ajouter des produits
        produit.add(p1);
        produit.add(p2);
        produit.add(p3);

        // supprimer produit
        produit.remove(0);
        produit.remove(0);

        // afficher la liste des produits
        for (Produit produit1 : produit) {
            System.out.println(produit1.toString());
        }

        // modifier un produit par indice

        if (!produit.isEmpty()){
            Produit produitAModifier = produit.get(0);

            produitAModifier.setId(17);
            produitAModifier.setNom("USB");
            produitAModifier.setPrix(100);

            System.out.println("Produit modifier avec succé");
        }
        else {
            System.out.println("Aucun produit à modifier");
        }

        // Rechercher un produit dont le nom est tapé par l’utilisateur.
        System.out.println("Saisissez le nom du produit souhaité : ");
        String nom1 = scanner.nextLine().trim();

        boolean produitTrouve = false;
        for (Produit produit1 : produit) {
            if (produit1.getNom().equalsIgnoreCase(nom1)) {
                System.out.println(produit1.toString());
                produitTrouve = true;
                break;
            }
        }

        if (!produitTrouve) {
            System.out.println("Le produit n'existe pas !!");
        }



    }
}
