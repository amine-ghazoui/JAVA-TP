package exercice_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        conjugaison verbe = new conjugaison();
        System.out.println("Entrer un verbe de 1ére groupe :");
        String mot = scanner.nextLine();


        verbe.verbePremGrp(mot);
    }
}
