package exercice_1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbre;

        try {
            Socket s = new Socket("localhost", 1234);
            System.out.println("Connecté au serveur de jeu.");

            // Création des flux pour la communication avec le serveur

            // Pour lire les réponses du serveur
            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            // Pour envoyer des données au serveur
            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            // Lecture de la réponse du serveur
            String rep = br.readLine(); // Lecture d'une ligne de texte du serveur
            System.out.println(rep);

            // Boucle pour envoyer des tentatives et recevoir des réponses
            boolean jeuTerminé = false;
            while (!jeuTerminé) {
                System.out.print("Donner un nombre : ");
                int nb = scanner.nextInt(); // Lire la tentative de l'utilisateur
                pw.println(nb); // Envoyer la tentative au serveur

                String reponse = br.readLine(); // Lire la réponse du serveur
                System.out.println(reponse);

                // Vérifier si le jeu est terminé
                if (reponse.startsWith("Bravo")) {
                    jeuTerminé = true;
                }
            }

            s.close();

        }
        catch (Exception e) {
            e.getMessage();
        }
    }
}
