package exercice_3;

public class NoteInvalideException extends Exception{

    // Constructeur qui initialise le message d'exception avec la note invalide
    public NoteInvalideException(int entier){
        super("Exception de type NoteInvalideException. Note invalide : " + entier);
    }


}
