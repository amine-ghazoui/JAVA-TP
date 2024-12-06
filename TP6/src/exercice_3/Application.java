package exercice_3;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MetierProduitImpl metierProduit = new MetierProduitImpl();
        MetierClientImpl metierClient = new MetierClientImpl();

        while (true) {
            System.out.println("\n----------------Menu Principal---------------- :");
            System.out.println("1. Gérer les Produits");
            System.out.println("2. Gérer les Clients");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option : ");
            int choixPrincipal = scanner.nextInt();
            scanner.nextLine();

            if (choixPrincipal == 1) {
                // Menu pour gérer les produits
                while (true) {
                    System.out.println("\n----------------Menu Produits---------------- :");
                    System.out.println("1. Afficher la liste des produits");
                    System.out.println("2. Rechercher un produit par nom");
                    System.out.println("3. Ajouter un nouveau produit");
                    System.out.println("4. Supprimer un produit par nom");
                    System.out.println("5. Sauvegarder les produits");
                    System.out.println("6. Retour au menu principal");
                    System.out.print("Choisissez une option : ");
                    int choixProduit = scanner.nextInt();
                    scanner.nextLine();

                    switch (choixProduit) {
                        case 1:
                            List<Produit> produits = metierProduit.getAll();
                            for (Produit produit : produits) {
                                System.out.println(produit);
                            }
                            break;

                        case 2:
                            System.out.print("Entrez le nom du produit : ");
                            String nomProduit = scanner.nextLine();
                            Produit produit = metierProduit.findByNom(nomProduit);
                            if (produit != null) {
                                System.out.println(produit);
                            } else {
                                System.out.println("Produit non trouvé !");
                            }
                            break;

                        case 3:
                            System.out.print("Nom : ");
                            String nom = scanner.nextLine();
                            System.out.print("Marque : ");
                            String marque = scanner.nextLine();
                            System.out.print("Prix : ");
                            double prix = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Description : ");
                            String description = scanner.nextLine();
                            System.out.print("Nombre en stock : ");
                            int nombreStock = scanner.nextInt();
                            scanner.nextLine();
                            metierProduit.add(new Produit(nom, marque, prix, description, nombreStock));
                            System.out.println("Produit ajouté avec succès !");
                            break;

                        case 4:
                            System.out.print("Entrez le nom du produit à supprimer : ");
                            String nomSupprimer = scanner.nextLine();
                            metierProduit.delete(nomSupprimer);
                            break;

                        case 5:
                            metierProduit.saveAll();
                            System.out.println("Produits sauvegardés avec succès !");
                            break;

                        case 6:
                            break;

                        default:
                            System.out.println("Option invalide !");
                    }

                    if (choixProduit == 6) break;
                }

            } else if (choixPrincipal == 2) {
                // Menu pour gérer les clients
                while (true) {
                    System.out.println("\nMenu Clients :");
                    System.out.println("1. Afficher la liste des clients");
                    System.out.println("2. Rechercher un client par nom");
                    System.out.println("3. Ajouter un nouveau client");
                    System.out.println("4. Supprimer un client par nom");
                    System.out.println("5. Sauvegarder les clients");
                    System.out.println("6. Retour au menu principal");
                    System.out.print("Choisissez une option : ");
                    int choixClient = scanner.nextInt();
                    scanner.nextLine();

                    switch (choixClient) {
                        case 1:
                            List<Client> clients = metierClient.getAll();
                            for (Client client : clients) {
                                System.out.println(client);
                            }
                            break;

                        case 2:
                            System.out.print("Entrez le nom du client : ");
                            String nomClient = scanner.nextLine();
                            Client client = metierClient.findByNom(nomClient);
                            if (client != null) {
                                System.out.println(client);
                            } else {
                                System.out.println("Client non trouvé !");
                            }
                            break;

                        case 3:
                            System.out.print("Nom : ");
                            String nom = scanner.nextLine();
                            System.out.print("Prénom : ");
                            String prenom = scanner.nextLine();
                            System.out.print("Adresse : ");
                            String adresse = scanner.nextLine();
                            System.out.print("Téléphone : ");
                            String tele = scanner.nextLine();
                            System.out.print("Email : ");
                            String email = scanner.nextLine();
                            metierClient.add(new Client(nom, prenom, adresse, tele, email));
                            System.out.println("Client ajouté avec succès !");
                            break;

                        case 4:
                            System.out.print("Entrez le nom du client à supprimer : ");
                            String nomSupprimer = scanner.nextLine();
                            metierClient.delete(nomSupprimer);
                            break;

                        case 5:
                            metierClient.saveAll();
                            System.out.println("Clients sauvegardés avec succès !");
                            break;

                        case 6:
                            break;

                        default:
                            System.out.println("Option invalide !");
                    }

                    if (choixClient == 6) break;
                }

            } else if (choixPrincipal == 3) {
                System.out.println("Au revoir !");
                break;
            } else {
                System.out.println("Option invalide !");
            }
        }

        scanner.close();

    }
}
