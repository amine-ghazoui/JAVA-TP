package exercice_1;

import java.util.Scanner;

public class Application {

    public static void affichagMenu(){
        System.out.println("----------MENU-----------");
        System.out.println("1. Afficher la liste des produits.");
        System.out.println("2. Rechercher un produit par son id.");
        System.out.println("3. Ajouter un nouveau produit dans la liste.");
        System.out.println("4. Supprimer un produit par id.");
        System.out.println("5. Quitter ce programme.");
        System.out.print("Choisissez une option : ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MetierProduitImpl metier = new MetierProduitImpl();

        Produit p1 = new Produit(1, "Smartphone", "Samsung", 799.99, "Galaxy S21, 128GB", 10);
        Produit p2 = new Produit(2, "Laptop", "Dell", 1199.99, "XPS 13, 16GB RAM, 512GB SSD", 5);
        Produit p3 = new Produit(3, "Tablette", "Apple", 599.99, "iPad Air, 64GB", 15);

        metier.add(p1);
        metier.add(p2);
        metier.add(p3);

        while (true){
            affichagMenu();
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1 :
                    for (Produit produit : metier.getAll()) {
                        System.out.println(produit.toString());
                    }
                    break;

                case 2 :
                    System.out.println("Saisir l'ID du produit :");
                    int iD = scanner.nextInt();
                    Produit prod = metier.findById(iD);
                    if (prod != null){
                        System.out.println(prod.toString());
                    }
                    else {
                        System.out.println("Produit non trouvé.");
                    }
                    break;

                case 3 :
                    System.out.println("Entrer les informations du produit: ");
                    System.out.println("Entrez l'id du produit : ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consomme le retour à la ligne
                    System.out.print("Entrez le nom du produit : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez la marque du produit : ");
                    String marque = scanner.nextLine();
                    System.out.print("Entrez le prix du produit : ");
                    double prix = scanner.nextDouble();
                    scanner.nextLine(); // Consomme le retour à la ligne
                    System.out.print("Entrez la description du produit : ");
                    String description = scanner.nextLine();
                    System.out.print("Entrez le nombre en stock du produit : ");
                    int nombreEnStock = scanner.nextInt();

                    Produit nouveauProd = new Produit(id, nom, marque, prix, description, nombreEnStock);
                    metier.add(nouveauProd);
                    System.out.println("Produit ajouté avec succès.");
                    break;

                case 4 :
                    // Supprimer un produit par id
                    System.out.print("Entrez l'id du produit à supprimer : ");
                    int idSupprimer = scanner.nextInt();
                    metier.delete(idSupprimer);
                    System.out.println("Produit supprimé si existant.");
                    break;

                case 5 :
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;

                default:
                    System.out.println("Option invalid !!");
                    break;
            }

        }
    }
}
    // https://chatgpt.com/c/673cd253-1c38-800d-829d-27f889df2629