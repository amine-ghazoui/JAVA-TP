package exercice_3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierClientImpl implements IMetier<Client> {

    private List<Client> listClients;
    private String fichierClient;


    public MetierClientImpl() {
        this.fichierClient = "D:\\POO_SDIA\\JAVA-TP\\TP6\\src\\exercice_3\\clients.dat";
        this.listClients = new ArrayList<>();
    }

    // Ajoute un client à la liste en mémoire.
    @Override
    public Client add(Client clt) {
        listClients.add(clt); // Ajout du client à la liste
        return clt; // Retourne le client ajouté
    }

    //Charge tous les clients depuis le fichier et les ajoute à la liste.
    @Override
    public List<Client> getAll() {
        try {
            File file = new File(fichierClient); // Ouvre le fichier contenant les clients
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            while ((line = br.readLine()) != null) { // Parcourt chaque ligne du fichier
                String[] parti = line.split(";"); // Sépare les attributs du client

                // Vérifie que tous les attributs nécessaires sont présents
                if (parti.length == 5) {
                    String nom = parti[0];
                    String prenom = parti[1];
                    String adresse = parti[2];
                    String tele = parti[3];
                    String email = parti[4];


                    Client client = new Client(nom, prenom, adresse, tele, email);
                    listClients.add(client);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listClients;
    }

    //Recherche un client par son nom.
    @Override
    public Client findByNom(String nom) {
        Client clientR = null;
        for (Client client : listClients) {
            // Si un client avec le nom correspondant est trouvé, le retourner
            if (client.getNom().equalsIgnoreCase(nom) && clientR == null) {
                clientR = new Client(client.getNom(), client.getPrenom(), client.getAdresse(), client.getTele(), client.getEmail());
            }
        }
        return clientR;
    }

   //Supprime un client de la liste en mémoire en fonction de son nom.
    @Override
    public void delete(String nom) {
        for (int i = 0; i < listClients.size(); i++) {
            Client client = listClients.get(i);
            // Si un client avec le nom correspondant est trouvé, le supprimer
            if (client.getNom().equalsIgnoreCase(nom)) {
                listClients.remove(i); // Suppression du client
                System.out.println("Le client '" + nom + "' a été supprimé avec succès.");
                i--;
            }
        }
    }

   //Sauvegarde tous les clients de la liste dans le fichier.
    @Override
    public void saveAll() {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(fichierClient));
            for (Client client : listClients) {
                // Format des données du client à écrire dans le fichier
                String lineClient = String.format("%s;%s;%s;%s;%s", client.getNom(), client.getPrenom(), client.getAdresse(), client.getTele(), client.getEmail());
                br.write(lineClient);
                br.newLine(); // Passage à la ligne suivante
            }
            br.close();
            System.out.println("Les clients ont été sauvegardés avec succès.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
