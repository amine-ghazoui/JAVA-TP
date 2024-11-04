package exercice_2;

// Classe personnalisée pour gérer une exception de racine carrée négative
public class RacineCarreeException extends Exception{

    // Constructeur prenant un entier et affichant un message spécifique
    public RacineCarreeException(int entier){
        super("C'est une exception de type RacineCarreeException. Nombre négatif : " + entier);
    }
}
