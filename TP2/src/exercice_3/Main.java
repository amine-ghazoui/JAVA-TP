package exercice_3;

public class Main {
    public static void main(String[] args) {

        // Création de la liste d'ordinateurs
        Ordinateur ordinateur_1 = new Ordinateur("ELITEBOOK", "HP", 5000, "i7 10gen", 3);
        Ordinateur ordinateur_2 = new Ordinateur("LATITUD", "DELL", 3000, "i5 6gen", 6);
        Ordinateur ordinateur_3 = new Ordinateur("TINKPAD", "LENEVO", 2400, "i5 8gen", 17);

        // Création de la catégorie
        Categorer categorer = new Categorer("Électroniques", "Ordinateurs de toutes sortes");
        categorer.ajouterOrdinateur(ordinateur_1);
        categorer.ajouterOrdinateur(ordinateur_2);
        categorer.ajouterOrdinateur(ordinateur_3);

        // Création d'un client
        Client client = new Client("Mohamed amine", "Ghazoui", "ghazoui23@gmail.com", "Quartier administratif Tinghir", "Tinghir", "0655691205");

        // Création d'une commande
        Commande commande = new Commande("CMD001", client, "29/10/2024", "En attente");

        // Ajout de la commande au client
        client.ajouterCommande(commande);

        // Création de lignes de commande
        LigneCommande ligneCommande1 = new LigneCommande(2, commande, ordinateur_1);
        LigneCommande ligneCommande2 = new LigneCommande(1, commande, ordinateur_2);
        LigneCommande ligneCommande3 = new LigneCommande(1, commande, ordinateur_3);


        //Affichege des informations de la commande
        System.out.println(commande);
        System.out.println("Ligne de commande :");
        System.out.println(ligneCommande1);
        System.out.println(ligneCommande2);
        System.out.println(ligneCommande3);
        System.out.println("Client : " +client);

    }
}
