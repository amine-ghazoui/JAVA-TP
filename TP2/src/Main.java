import exercice_1.Adherent;
import exercice_1.Auteur;
import exercice_1.Livre;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Insirer les informations de l'adherent :");
        System.out.println("Nom : ");
        String nom_Ad = scanner.nextLine();
        System.out.println("Prénom : ");
        String prenom_Ad = scanner.nextLine();
        System.out.println("Email : ");
        String email_Ad = scanner.nextLine();
        System.out.println("Tele : ");
        String tele_Ad = scanner.nextLine();
        System.out.println("Age : ");
        int age_Ad = scanner.nextInt();
        System.out.println("Numéro adhérent : ");
        int numAdherent = scanner.nextInt();

        System.out.println("Information de livre : ");
        System.out.println("ISBN : ");
        int isbn = scanner.nextInt();
        System.out.println("Titre de livre : ");
        String titreLivre = scanner.nextLine();

        System.out.println("Insirer les informations de l'auteur : ");
        System.out.println("Nom : ");
        String nom_A = scanner.nextLine();
        System.out.println("Prénom : ");
        String prenom_A = scanner.nextLine();
        System.out.println("Email : ");
        String email_A = scanner.nextLine();
        System.out.println("Tele : ");
        String tele_A = scanner.nextLine();
        System.out.println("Age : ");
        int age_A = scanner.nextInt();
        System.out.println("Numéro de l'auteur : ");
        int numAuteur = scanner.nextInt();

        Adherent ad = new Adherent(nom_Ad, prenom_Ad, email_Ad, tele_Ad, age_Ad, numAdherent);
        Auteur au = new Auteur(nom_A, prenom_A, email_A, tele_A, age_A, numAuteur);
        Livre lv = new Livre(isbn, au, titreLivre);

        ad.afficher();
        lv.afficher();*/

        Adherent ad = new Adherent("amine", "ghazoui", "ghazoui23@gmail.com", "0655691205", 23, 12);
        Auteur au = new Auteur("victor", "Hugo", "Hugo@gmail.com", "098878", 34, 3);
        Livre lv = new Livre(45, au, "antigone");

        ad.afficher();
    }
}