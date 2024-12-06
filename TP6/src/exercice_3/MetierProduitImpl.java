package exercice_3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {

    private List<Produit> listProduits;
    private String fichierProduit;


    public MetierProduitImpl() {
        this.fichierProduit = "D:\\POO_SDIA\\JAVA-TP\\TP6\\src\\exercice_3\\produits.txt";
        this.listProduits = new ArrayList<>();
    }

    //Ajoute un produit à la liste en mémoire.
    @Override
    public Produit add(Produit prod) {
        listProduits.add(prod);
        return prod;
    }

    //Charge tous les produits depuis le fichier et les ajoute à la liste.
    @Override
    public List<Produit> getAll() {
        try {
            File file = new File(fichierProduit);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parti = line.split(";");

                // Vérifie que tous les attributs nécessaires sont présents
                if (parti.length == 5) {
                    String nom = parti[0];
                    String marque = parti[1];
                    double prix = Double.parseDouble(parti[2]);
                    String description = parti[3];
                    int nombreStock = Integer.parseInt(parti[4]);

                    // Crée un produit à partir des données lues
                    Produit produit = new Produit(nom, marque, prix, description, nombreStock);
                    listProduits.add(produit);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProduits;
    }

    //Recherche un produit par son nom.
    @Override
    public Produit findByNom(String nom) {
        Produit produitR = null;
        for (Produit prod : listProduits) {

            if (prod.getNom().equalsIgnoreCase(nom) && produitR == null) {
                produitR = new Produit(prod.getNom(), prod.getMarque(), prod.getPrix(), prod.getDescription(), prod.getNombreStock());
            }
        }
        return produitR;
    }

    //Supprime un produit de la liste en mémoire en fonction de son nom.
    @Override
    public void delete(String nom) {
        for (int i = 0; i < listProduits.size(); i++) {
            Produit produit = listProduits.get(i);

            if (produit.getNom().equalsIgnoreCase(nom)) {
                listProduits.remove(i);
                System.out.println("Le produit '" + nom + "' a été supprimé avec succès.");
                i--;
            }
        }
    }

    //Sauvegarde tous les produits de la liste dans le fichier.
    @Override
    public void saveAll() {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(fichierProduit));
            for (Produit produit : listProduits) {
                String lineProd = String.format("%s;%s;%.2f;%s;%d", produit.getNom(), produit.getMarque(), produit.getPrix(), produit.getDescription(), produit.getNombreStock());
                br.write(lineProd);
                br.newLine();
            }
            br.close();
            System.out.println("Les produits ont été sauvegardés avec succès.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
