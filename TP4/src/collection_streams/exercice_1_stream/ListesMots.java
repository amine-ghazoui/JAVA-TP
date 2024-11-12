package collection_streams.exercice_1_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListesMots {
    public static void main(String[] args) {

        // Liste de mots
        List<String> mots = Arrays.asList("chat", "chien", "arbre", "maison", "voiture", "chambre", "pomme");

        //Filtrer les mots qui contiennent la lettre "a".
        List<String> motsAvecA = mots.stream()
                            .filter(mot -> mot.contains("a"))
                            .collect(Collectors.toList());

        System.out.println("Mots contenant 'a' : " + motsAvecA);


        // Filtrer les mots qui ont une longueur supérieure à 3 et transformer chaque mot en son inverse.
        List<String> inverseMot = mots.stream()
                                .filter(mot -> mot.length() > 3) // Filtrer les mots dont la longueur > 3
                                .map(mot -> new StringBuilder(mot).reverse().toString()) // Inverser chaque mot
                                .collect(Collectors.toList());

        System.out.println("Mots inversés : " + inverseMot);


        //Filtrer les chaînes qui contiennent la lettre "e" et aplatir chaque chaîne en une liste de ses caractères.
        List<Character> caracteres = mots.stream()
                .filter(mot -> mot.contains("e"))  // Filtrer les mots contenant "e"
                .flatMap(mot -> mot.chars().mapToObj(c -> (char) c))// Convertir chaque mot en un flux d'entiers (ASCII), puis en un flux de caractères
                .collect(Collectors.toList());

        System.out.println("Caractères des mots contenant 'e' : " + caracteres);


        // Transformer chaque chaîne en sa version en majuscules.
        List<String> motMajusule = mots.stream()
                                .map(mot ->mot.toUpperCase())
                                .collect(Collectors.toList());

        System.out.println("Mots en majuscules : " + motMajusule);


        //Convertir chaque chaîne en sa longueur.
        List<Integer> longeurChaine = mots.stream()
                                    .map(mot ->mot.length()) // Transformer chaque mot en sa longueur
                                    .collect(Collectors.toList());

        System.out.println("Longueur des mots : " + longeurChaine);


        // Transformer chaque chaîne en une liste de ses caractères, puis aplatir toutes les listes en une seule liste de caractères.
        List<Character> listeCaracteres = mots.stream()
                                        .flatMap(mot ->mot.chars() // Convertir chaque mot en un flux d'entiers (ASCII)
                                                .mapToObj(c -> (char) c)) // Convertir chaque entier en un caractère
                                        .collect(Collectors.toList());

        System.out.println("Tous les caractères aplatis : " + listeCaracteres);


        // À partir d'une liste de mots, transformer chaque nom en une chaîne de la forme "Nom - Index" où l'index représente la position du nom dans la liste.
        List<String> motsIndex = mots.stream()
                                .map(mot -> mot + " - " + mots.indexOf(mot))  // Ajouter l'index à chaque mot
                                .collect(Collectors.toList());

        System.out.println("Mots avec index : " + motsIndex);
    }
}
