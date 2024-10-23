package exercice_1;

import java.util.Arrays;
import java.util.Scanner;

public class OperationNotesEtudiants {
    private float[] notes;

    // Constructeur pour initialiser le tableau de notes
    public OperationNotesEtudiants(int nmbrEtud) {
        this.notes = new float[nmbrEtud];
    }

    public void SaisirEtudiant(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Entrer la note de l'étudiant N "+(i+1));
            notes[i] = scanner.nextFloat();
        }

    }

    // Méthode pour trier le tableau de notes
    public void trierListEtud() {
        Arrays.sort(notes);  // Utilisation correcte de Arrays.sort()
        for (int i = 0; i < notes.length; i++) {
            System.out.println("étudiant N "+i+" : "+notes[i]);
        }
    }

    public void noteMoyenne(){
        float somme = 0;
        int nbr = notes.length;
        for (int i = 0; i < notes.length; i++) {
            somme += notes[i];
        }
        float moyenne = somme/nbr;
        System.out.println("La moyenne est : " +moyenne);
    }

    public void notMaxMin(){
        float max = notes[0];
        float min = notes[0];
        for (float notesArray : notes) {
            if (notesArray > max){
                max = notesArray;
            }
            if (notesArray < min){
                min = notesArray;
            }
        }
        System.out.println("la note maximale est : "+max);
        System.out.println("la note minimale est : "+min);
    }

    public void nombreEtud(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer une note à rechercher : ");
        float noteRecherche = scanner.nextFloat();
        int cmp = 0;
        for (float note : notes) {
            if (note == noteRecherche){
                cmp++;
            }
        }
        System.out.println("Nombre d'étudiants ayant la note " + noteRecherche + " est : " +cmp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer le nombre d'étudiant : ");
        int nombreEtud = scanner.nextInt();

        OperationNotesEtudiants gestionNote = new OperationNotesEtudiants(nombreEtud);

        // Saisie des notes
        gestionNote.SaisirEtudiant();

        // Tri et affichage des notes
        gestionNote.trierListEtud();

        // Affichage de la note moyenne
        gestionNote.noteMoyenne();

        // Recherche du nombre d'étudiants ayant une note spécifique
        gestionNote.notMaxMin();

        // Recherche du nombre d'étudiants ayant une note spécifique
        gestionNote.nombreEtud();

    }
}