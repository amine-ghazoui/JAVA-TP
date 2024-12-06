package exercice_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DossierContact {

    private final List<String> noms;    // Liste des noms de contacts
    private final List<String> numeros; // Liste des numéros associés

    public DossierContact() {
        noms = new ArrayList<>();
        numeros = new ArrayList<>();
        chargerContacts();
    }

    //Charge les contacts depuis les fichiers du dossier 'contacts'.
    private void chargerContacts() {
        File dossier = new File("contacts");
        if (!dossier.exists()) {
            dossier.mkdir(); // Créer le dossier s'il n'existe pas
        }

        File[] fichiers = dossier.listFiles();
        if (fichiers != null) {
            for (File fichier : fichiers) {
                BufferedReader reader = null;
                try {
                    reader = new BufferedReader(new FileReader(fichier));
                    String numero = reader.readLine();
                    noms.add(fichier.getName());
                    numeros.add(numero);
                }
                catch (IOException e) {
                    System.out.println("Erreur lors du chargement du fichier : " + fichier.getName());
                }
            }
        }
    }

    //Sauvegarde tous les contacts dans des fichiers individuels.
    private void sauvegarderContacts() {
        File dossier = new File("contacts");
        if (!dossier.exists()) {
            dossier.mkdir();
        }

        for (int i = 0; i < noms.size(); i++) {
            File fichier = new File(dossier, noms.get(i));
            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(new FileWriter(fichier));
                writer.write(numeros.get(i));
            }
            catch (IOException e) {
                System.out.println("Erreur lors de l'écriture du fichier : " + fichier.getName());
            }
        }
    }

    //Ajoute un contact avec validation et vérification de doublons.
    public void ajouterContact(String nom, String numero) {
        if (nom == null || nom.isEmpty() || numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("Le nom et le numéro ne peuvent pas être vides.");
        }
        if (noms.contains(nom)) {
            System.out.println("Le contact existe déjà.");
            return;
        }
        noms.add(nom);
        numeros.add(numero);
        sauvegarderContacts();
    }

    //Supprime un contact par son nom.
    public void supprimerContact(String nom) {
        int index = noms.indexOf(nom);
        if (index != -1) {
            noms.remove(index);
            numeros.remove(index);
            File fichier = new File("contacts", nom);
            if (fichier.exists()) {
                fichier.delete();
            }
        } else {
            System.out.println("Contact non trouvé.");
        }
    }

    //Recherche un contact par son nom.
    public String rechercherContact(String nom) {
        int index = noms.indexOf(nom);
        return (index != -1) ? numeros.get(index) : "Contact non trouvé.";
    }

    //Change le numéro d'un contact existant.
    public void changerNumero(String nom, String nouveauNumero) {
        int index = noms.indexOf(nom);
        if (index != -1) {
            numeros.set(index, nouveauNumero);
            sauvegarderContacts();
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}
