package exercice_1;

public class Main {
    public static void main(String[] args) {
        // Déclaration et instanciation d'un adhérent
        Adherent adherent = new Adherent("Mohamed amine", "ghazoui", "amineghazoui@gmail.com", "0655691205",23, 23);

        // Déclaration et instanciation d'un auteur
        Auteur auteur = new Auteur("victor", "Hugo", "hugo123@gmail.com", "+345677685698", 56, 2);

        // Déclaration et instanciation d'un livre
        Livre livre = new Livre(1234, auteur, "Notre Dame De Paris");

        // Affichage des informations de l'adhérent et du livre
        System.out.println("Informations de l'adhérent :");
        adherent.afficher();

        System.out.println("\nInformations du livre :");
        livre.afficher();

    }
}
