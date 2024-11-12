package collection_.exercice_2_collection;

import java.util.HashMap;
import java.util.Map;

public class NotesEtudiants {
    public static void main(String[] args) {

        // Création d'un hashMap pour stocker les étudiants
        Map<String, Double> notesEtudiants = new HashMap<>();

        // Insérer les notes des étudiants
        notesEtudiants.put("Amine", 17.5);
        notesEtudiants.put("Soufiane", 16.0);
        notesEtudiants.put("Ibtissame", 19.0);

        // Augmenter la note d'un étudiant
        String etudiant = "Amine";
        double augmentation = 1.5;
        notesEtudiants.put(etudiant, notesEtudiants.get(etudiant) + augmentation);
        System.out.println("La note de l'étudiant " + etudiant + " a été augmentée avec succès.");

        // Supprimer la note d'un étudiant
        notesEtudiants.remove("Ibtissame");
        System.out.println("La note de l'étudiant Ibtissame a été supprimée avec succès.");

        // Affichage de la taille du map
        System.out.println("La taille du map est : " + notesEtudiants.size());

        // Affichage de la note moyenne, max et min
        if (notesEtudiants.isEmpty()) {
            System.out.println("Aucune note disponible.");
        } else {
            double somme = 0;
            double max = Double.MIN_VALUE;
            double min = Double.MAX_VALUE;

            for (Double note : notesEtudiants.values()) {
                somme += note;
                if (note > max) {
                    max = note;
                }
                if (note < min) {
                    min = note;
                }
            }

            double moyenne = somme / notesEtudiants.size();
            System.out.printf("Moyenne : %.2f\n", moyenne);
            System.out.printf("Note max : %.2f\n", max);
            System.out.printf("Note min : %.2f\n", min);
        }

        // Vérifier s'il y a une note égale à 20
        boolean existNote = notesEtudiants.containsValue(20.0);
        System.out.println("Y a-t-il une note de 20 ? " + (existNote ? "Oui" : "Non"));

        // Afficher la liste des notes
        System.out.println("Liste des notes : ");
        notesEtudiants.forEach((nom, note) -> System.out.println(nom + " : " + note));
    }
}
