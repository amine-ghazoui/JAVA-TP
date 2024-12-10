package exercice_2;

public class Sommeur implements Runnable {

    private int[] tab;
    private int debut;
    private int fin;
    private int somme;

    public Sommeur(int[] tab, int debut, int fin) {
        this.tab = tab;
        this.debut = debut;
        this.fin = fin;
        this.somme = 0;
    }

    public int getSomme() {
        return somme;
    }

    @Override
    public void run() {
        for (int i = debut; i <= fin; i++) {
            somme += tab[i];
        }
    }
}
