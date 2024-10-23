package exercice_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir une chaine de caratére :");
        String ch = scanner.nextLine();
        CompteurOccurence chaine = new CompteurOccurence(ch);
        chaine.operation();

    }
}
