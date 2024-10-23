package exercice_3;

import java.util.Scanner;

public class OperationChaine {

    public String chaine = "";
    Scanner scanner = new Scanner(System.in);

    public void operation(){
        int op;

        do {
            System.out.println("Choisir une opéraion à effectuer (1, 2, 3, 4) : ");
            afficherMenu();
            op = scanner.nextInt();
            scanner.nextLine();
            switch (op){
                case 1 : saisir();
                         break;
                case 2 : afficherChaine();
                         break;
                case 3 : inverser();
                         break;
                case 4 : nombreMot();
                         break;
                default : System.out.println("Choix non valide.");
                          break;
            }
            System.out.println("Voulez-vous retourner au menu ? (taper 0 ou 1)");
            op = scanner.nextInt();

        }while (op != 0);
    }

    public void saisir(){

        System.out.println("Saisir une chaîne de caractères :");
        chaine = scanner.nextLine();
    }

    public void afficherChaine(){
        if (chaine.isEmpty()){
            System.out.println("aucun chaine saisie !");
        }
        else {
            System.out.println("la chaine saise est : "+chaine);
        }
    }

    public void inverser(){
        if (!chaine.isEmpty()) {
            StringBuilder inverse = new StringBuilder(chaine);
            chaine = inverse.reverse().toString();
            System.out.println("Chaîne inversée: " + chaine);
        } else {
            System.out.println("Aucune chaîne saisie.");
        }
    }

    public void nombreMot(){
        if (!chaine.isEmpty()) {
            String[] mots = chaine.trim().split(" ");
            System.out.println("Nombre de mots: " + mots.length);
        } else {
            System.out.println("Aucune chaîne saisie.");
        }
    }

    public void afficherMenu(){
        System.out.println("--------MENU------------");
        System.out.println("1. Saisir une chaîne");
        System.out.println("2. Afficher la chaîne");
        System.out.println("3. Inverser la chaîne");
        System.out.println("4. Nombre de mots dans la chaîne");
    }
}
