package collection_.exercice_3_collection;

import java.util.HashSet;
import java.util.Set;

public class gererNotesEtudiants {
    public static void main(String[] args) {

        // Création des deux HashSets pour les groupes A et B
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();

        // Ajout des noms des étudiants à chaque HashSet
        groupeA.add("Ghazoui");
        groupeA.add("Ait bahadou");
        groupeA.add("boulmani");
        groupeA.add("abdelhadi");

        groupeB.add("Ait bahadou");
        groupeB.add("Ghazoui");
        groupeB.add("Essalhi");
        groupeB.add("Elmoktari");

        // Calcul et affichage de l'intersection des deux HashSets
        Set<String> intersection = new HashSet<>();
        intersection.addAll(groupeA);
        intersection.retainAll(groupeB);
        System.out.println("Intersection des deux HashSet : " + intersection);

        // Calcul et affichage de l'union des deux HashSets
        Set<String> union = new HashSet<>();
        union.addAll(groupeA);
        union.addAll(groupeB);
        System.out.println("Union des deux Hashset : "+union);



    }
}
