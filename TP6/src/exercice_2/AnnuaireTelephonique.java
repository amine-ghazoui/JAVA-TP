package exercice_2;

import java.util.Scanner;

public class AnnuaireTelephonique {
    public static void main(String[] args) {

        DossierContact dossier = new DossierContact();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu :");
            System.out.println("1. Rechercher un numéro de téléphone");
            System.out.println("2. Ajouter un nouveau contact");
            System.out.println("3. Supprimer un contact");
            System.out.println("4. Changer le numéro de téléphone d’un contact");
            System.out.println("5. Quitter ce programme");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    System.out.print("Entrez le nom du contact : ");
                    String nomRecherche = scanner.nextLine();
                    System.out.println("Numéro : " + dossier.rechercherContact(nomRecherche));
                    break;
                case 2:
                    System.out.print("Entrez le nom du contact : ");
                    String nomAjout = scanner.nextLine();
                    System.out.print("Entrez le numéro de téléphone : ");
                    String numeroAjout = scanner.nextLine();
                    dossier.ajouterContact(nomAjout, numeroAjout);
                    break;
                case 3:
                    System.out.print("Entrez le nom du contact à supprimer : ");
                    String nomSuppression = scanner.nextLine();
                    dossier.supprimerContact(nomSuppression);
                    break;
                case 4:
                    System.out.print("Entrez le nom du contact : ");
                    String nomModification = scanner.nextLine();
                    System.out.print("Entrez le nouveau numéro : ");
                    String nouveauNumero = scanner.nextLine();
                    dossier.changerNumero(nomModification, nouveauNumero);
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;
                default:
                    System.out.println("Option invalide, veuillez réessayer.");
            }
        }
    }
}
