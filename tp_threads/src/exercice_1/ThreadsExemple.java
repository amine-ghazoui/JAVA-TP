package exercice_1;

public class ThreadsExemple {
    public static void main(String[] args) {

        for (int i=1 ; i<=100 ; i++){
            Thread thread = new Thread(new Talkative(i));
            thread.start();

//            Talkative talkative = new Talkative(i);
//            Thread thread = new Thread(talkative);
//            thread.start();
        }
    }
}














/*
les threads s'exécutent en parallèle, entraînant un affichage désordonné et
 mélangé des sorties à la console, car l'exécution est concurrente et non déterministe.
 */
