package exercice_2;

public class ThreadSomme {
    public static void main(String[] args) {
        // Tableau de nombres
        int[] nombres = {5, 8, 33, 9, 80, 2, 73, 4, 56, 20, 34, 45, 58, 90};

        // Création des threads pour calculer des plages spécifiques
        Sommeur sommeur1 = new Sommeur(nombres, 0, 6); // Plage 0 à 6
        Sommeur sommeur2 = new Sommeur(nombres, 7, 13); // Plage 7 à 13

        Thread thread1 = new Thread(sommeur1);
        Thread thread2 = new Thread(sommeur2);

        // Démarrage des threads
        thread1.start();
        thread2.start();

        // Attente de la fin des threads
        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            e.getMessage();
        }

        // Calcul de la somme totale
        int sommeTotale = sommeur1.getSomme() + sommeur2.getSomme();

        // Affichage du résultat
        System.out.println("Somme totale : " + sommeTotale);
    }
}
