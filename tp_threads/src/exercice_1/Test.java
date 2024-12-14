package exercice_1;

public class Test implements Runnable{

    private String nomThread;

    public Test(String nom){
        this.nomThread = nom;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println("Thread " + nomThread + " - étape " + i);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.getMessage();
            }
            System.out.println("Thread " + nomThread + " terminé.");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Test("A"));
        Thread thread2 = new Thread(new Test("B"));
        Thread thread3 = new Thread(new Test("C"));

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Tous les threads sont démarrés.");

    }
}
