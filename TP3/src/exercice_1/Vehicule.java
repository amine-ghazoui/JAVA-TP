package exercice_1;

public class Vehicule {

    // Constructeur par défaut
    public Vehicule(){
    }

    // Méthode testVitesse : lance une TropViteException si la vitesse dépasse 90
    public void testVitesse(int vitesse) throws TropViteException {
        if (vitesse > 90){
            // Lance une exception personnalisée si la vitesse est supérieur a 90
            throw new TropViteException(vitesse);
        }
    }

    public static void main(String[] args) {

        Vehicule vehicuile = new Vehicule();

        // Test avec une vitesse inférieure à 90
        try {
            vehicuile.testVitesse(70);
            System.out.println("la vitesse 70 tester avec succée ");
        }
        catch (TropViteException e){
            e.printStackTrace();// Affiche la pile d'appel si une exception est levée
        }

        // Test avec une vitesse suppérieur à 90
        try {
            vehicuile.testVitesse(100);
            System.out.println("la vitesse 100 tester avec succée ");
        }
        catch (TropViteException ex){
            ex.printStackTrace(); // Affiche la pile d'appel si une exception est levée
            System.out.println(ex.getMessage()); // Affiche le message de l'exception
        }

    }
}
