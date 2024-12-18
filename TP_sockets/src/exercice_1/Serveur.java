package exercice_1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Serveur {

    public static void main(String[] args) {
        Random random = new Random();
        int numbreMagic = random.nextInt(0, 101);

        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("J'attends la connexion d'un client !");

            while (true){
                Socket s = ss.accept();
                System.out.println("Client connecté : "+s.getInetAddress());

                try {
                    // Création des flux d'entrée pour lire les données envoyées par le client
                    InputStream is = s.getInputStream();
                    InputStreamReader isr = new InputStreamReader(is);
                    BufferedReader br = new BufferedReader(isr);

                    // Création des flux de sortie pour envoyer des messages au client
                    OutputStream os = s.getOutputStream();
                    PrintWriter pw = new PrintWriter(os, true);

                    // Envoi d'un message d'accueil au client
                    pw.println("Bienvenue au jeu du Nombre Magique ! Essayez de deviner un nombre entre 0 et 100.");

                    boolean jeuTerminé = false;

                    // Boucle pour gérer les tentatives du client
                    while (!jeuTerminé){
                        String tentative = br.readLine(); // Lire la tentative du client

                        try {
                            int verif = Integer.parseInt(tentative);// Convertit la tentative en entier

                            // Compare la tentative avec le nombre magique et répond au client
                            if (verif < numbreMagic){
                                pw.println("C'est plus !");
                            }
                            else if (verif > numbreMagic) {
                                pw.println("C'est moins !");
                            }
                            else {
                                pw.println("Bravo ! Vous avez trouvé le nombre magique : " + numbreMagic);
                                jeuTerminé = true;
                            }
                        }
                        catch (Exception e) {
                            pw.println("Veuillez entrer un nombre validé !");
                        }
                    }
                }
                catch (Exception e) {
                    System.out.println("Erreur avec le client : " + e.getMessage());
                }
            }
        }
        catch (Exception e) {
            System.out.println("Erreur du serveur : " + e.getMessage());
        }
    }

}
