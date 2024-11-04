package exercice_3;


public class Evaluateur {

    public Evaluateur(){

    }

    // Méthode qui vérifie si la note est valide (entre 0 et 20)
    public void verifierNote(int note)throws NoteInvalideException{
        if ((note < 0) || (note > 20)){
            throw new NoteInvalideException(note);
        }
    }

    public static void main(String[] args) {

        Evaluateur evaluateur = new Evaluateur();

        // Test avec une note valide (15)
        try {
            evaluateur.verifierNote(15);
            System.out.println("la note 15 est admet");// Message clair et informatif
        }
        catch (NoteInvalideException nie){
            nie.printStackTrace();// Affiche la pile d'appel de l'exception
            System.out.println(nie.getMessage());// Affiche le message personnalisé de l'exception
        }

        // Test avec une note invalide (25)
        try {
            evaluateur.verifierNote(25);
            System.out.println("la note 25 est admet");
        }
        catch (NoteInvalideException n){
            n.printStackTrace();// Affiche la pile d'appel de l'exception
            System.out.println(n.getMessage());// Affiche le message personnalisé de l'exception
        }
    }


}
