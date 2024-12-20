package exercice_2;

import java.net.ServerSocket;
import java.net.Socket;

public class ServeurMT extends Thread {

    public int nbClient; // Compteur pour suivre le nombre de clients connectés

    @Override
    public void run() {

        try {
            // Création d'un serveur socket pour écouter les connexions sur le port 23456
            ServerSocket ss = new ServerSocket(23456);

            while (true) {
                // Acceptation d'une connexion client
                Socket s = ss.accept();
                ++nbClient; // Incrémentation du compteur de clients
                System.out.println("Nouveau client connecté : Client " + nbClient);

                // Création d'un thread pour gérer la communication avec ce client
                new Conversation(s, nbClient).start();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        // Création et démarrage du serveur multithreadé
        ServeurMT serveur = new ServeurMT();
        serveur.start();
    }
}
