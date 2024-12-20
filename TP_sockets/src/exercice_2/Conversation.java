package exercice_2;

import java.io.*;
import java.net.Socket;

public class Conversation extends Thread{

    private Socket socket; // Socket pour la communication avec le client
    private int numClien; // Numéro d'identification du client

    public Conversation(Socket socket, int numClien) {
        this.socket = socket;
        this.numClien = numClien;
    }

    @Override
    public void run() {

        try {
            // Création des flux pour la communication avec le client
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            // Envoi d'un message de bienvenue au client
            pw.println("Bienvenue Client : " + numClien);

            // Lecture du nom du fichier demandé par le client
            String nomFichier = br.readLine();
            System.out.println("Client :" + numClien + " a demandé le fichier : " + nomFichier);

            // Vérification de l'existence du fichier demandé
            File fichier = new File(nomFichier);
            if (fichier.exists() && fichier.isFile()) {
                pw.println("Fichier trouvé. Envoi en cours...");

                try {
                    // Lecture et envoi du contenu du fichier au client
                    FileReader fileR = new FileReader(fichier);
                    BufferedReader fileReader = new BufferedReader(fileR);
                    String ligne;

                    while ((ligne = fileReader.readLine()) != null) {
                        pw.println(ligne);
                    }
                    System.out.println("Le fichier a été envoyé au client : " + numClien);
                } catch (Exception e) {
                    // Gestion des exceptions lors de la lecture du fichier
                    System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
                }
            } else {
                // Message d'erreur si le fichier n'est pas trouvé
                pw.println("Fichier non trouvé !");
            }

            // Fermeture de la connexion avec le client
            socket.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
