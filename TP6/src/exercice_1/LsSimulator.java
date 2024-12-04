package exercice_1;

import java.io.File;
import java.util.Scanner;


public class LsSimulator {
    public static void main(String[] args) {

        // Demander à l'utilisateur de saisir le chemin du répertoire
        System.out.print("Entrez le chemin du répertoire : ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        scanner.close();

        // Appeler la méthode pour lister les fichiers et répertoires
        File dir = new File(path);
        if (dir.exists() && dir.isDirectory()) {
            listFilesAndDirectories(dir);
        } else {
            System.out.println("Le chemin spécifié n'est pas un répertoire valide.");
        }
    }

    // Méthode pour lister les fichiers et répertoires
    public static void listFilesAndDirectories(File dir) {
        // Lister les fichiers et répertoires dans le répertoire actuel
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                // Afficher les informations pour chaque fichier ou répertoire
                String type = file.isDirectory() ? "<DIR>" : "<FILE>";
                String permissions = getPermissions(file);

                // Affichage du chemin relatif et des informations
                System.out.println(file.getPath() + " " + type + " " + permissions);

                // Si c'est un répertoire, appeler la méthode récursive pour explorer ce répertoire
                if (file.isDirectory()) {
                    listFilesAndDirectories(file);
                }
            }
        }
    }

    // Méthode pour obtenir les permissions d'un fichier ou répertoire
    public static String getPermissions(File file) {
        String permissions = "";

        // Vérifier les permissions
        permissions += file.canRead() ? "r" : "-";
        permissions += file.canWrite() ? "w" : "-";
        permissions += file.isHidden() ? "h" : "-";

        return permissions;
    }
}
