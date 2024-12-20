package exercice_2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner pour lire les entrées utilisateur
        int numClient;

        try {
            // Connexion au serveur sur l'adresse localhost et le port 23456
            Socket socket = new Socket("localhost", 23456);

            // Création des flux pour la communication avec le serveur
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr); // Pour lire les messages du serveur

            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true); // Pour envoyer des messages au serveur

            // Lecture et affichage du message initial du serveur
            String rep = br.readLine();
            System.out.println(rep);

            // Lecture du nom du fichier à partir de l'entrée utilisateur
            System.out.print("Donner le nom de Ficheir : ");
            String nomFichier = scanner.nextLine();
            pw.println(nomFichier); // Envoi du nom du fichier au serveur

            // Lecture et affichage du contenu du fichier ou d'un message d'erreur envoyé par le serveur
            String ligne;
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne);
            }
        } catch (Exception e) {
            // Gestion des exceptions
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
