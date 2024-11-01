package exercice_4;

import java.util.Scanner;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        int star = 1;
        Scanner scanner = new Scanner(System.in);
        int op = 0;

        MetierProduitImpl metierProduit = new MetierProduitImpl();

        // Boucle principale du programme
        while (star == 1){
            // Affichage du menu des opérations disponibles
            System.out.println("choisir une opération à effectuer : (taper 1, 2, 3, 4 ou 5)");
            metierProduit.afficherOperation();
            op = scanner.nextInt();

            // Traitement des différentes options choisies
            switch (op){

                // Afficher la liste de tous les produits
                case 1 :
                    System.out.println(metierProduit.getAll().toString());
                    System.out.println("--------------------------------");
                    break;

                // Rechercher des produits par leur nom
                case 2 :
                    scanner.nextLine();
                    System.out.println("Insérer le nom du produit souhaité : ");
                    String nom1 = scanner.nextLine();
                    List<Produit> produitsTrouves = metierProduit.findByNom(nom1);
                    if (!produitsTrouves.isEmpty()) {
                        for (Produit produit : produitsTrouves) {
                            System.out.println(produit.toString());
                        }
                    } else {
                        System.out.println("Le produit recherché est introuvable.");
                    }
                    break;

                // Ajouter un nouveau produit
                case 3 :

                    System.out.print("Entrez l'ID du produit : ");
                    long id = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Entrez le nom du produit : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez la marque du produit : ");
                    String marque = scanner.nextLine();
                    System.out.print("Entrez le prix du produit : ");
                    double prix = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Entrez la description du produit : ");
                    String description = scanner.nextLine();
                    System.out.print("Entrez le nombre en stock : ");
                    int stock = scanner.nextInt();

                    Produit produit_1 = new Produit(id, nom, marque, prix, description, stock);
                    metierProduit.add(produit_1);
                    break;

                // Trouver et afficher un produit par ID
                case 4:
                    System.out.println("Insérer l'ID' du produit souhaité.");
                    long id1 = scanner.nextLong();
                    Produit produit2 = metierProduit.findById(id1);
                    System.out.println(produit2.toString());
                    break;

                // Supprimer un produit par ID
                case 5 :
                    System.out.println("Veuillez saisir l'ID du produit à supprimer.");
                    long id3 = scanner.nextLong();
                    metierProduit.delete(id3);

                    // Gérer les options invalides
                default:
                    System.out.println("Option non valide, veuillez réessayer.");
            }

            // Demander à l'utilisateur s'il souhaite retourner au menu ou quitter
            System.out.println("Voulez-vous retourner au menu ? taper 1");
            System.out.println("Souhaitez-vous quitter le programme ? taper 0 ");
            op = scanner.nextInt(); // Lire le choix de l'utilisateur
        }
    }
}
