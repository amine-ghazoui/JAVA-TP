package exercice_2;

public class Calculateur {

    public Calculateur(){

    }

    // Méthode testRacineCarree : lance une RacineCarreeException si l'entier est négatif
    public void testRacineCarree(int test)throws RacineCarreeException{

        if (test < 0){
            // Lance l'exception si le paramètre est négatif
            throw new RacineCarreeException(test);
        }
    }

    public static void main(String[] args) {

        Calculateur calculateur = new Calculateur();

        // Test avec un nombre négatif (-5)
        try{
            calculateur.testRacineCarree(-5);
            System.out.println("La valeur -5 est validée.");
        }
        catch (RacineCarreeException rce){
            rce.printStackTrace(); // Affiche la pile d'appel de l'exception
            System.out.println(rce.getMessage()); // Affiche le message personnalisé de l'éxecution
        }

        // Test avec un nombre positif (25)
        try {
            calculateur.testRacineCarree(25);
            System.out.println("la valeur 25 est valider");
        }
        catch (RacineCarreeException re){
            re.printStackTrace();// Affiche la pile d'appel de l'exception
            System.out.println(re.getMessage()); // Affiche le message personnalisé de l'exception
        }
    }
}
