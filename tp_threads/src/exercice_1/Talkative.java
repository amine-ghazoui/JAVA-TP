package exercice_1;

public class Talkative implements Runnable{
    private final int count;

    public Talkative(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0 ; i < 100 ; i++){
            System.out.println("Thread ID :"+count+ ", iteration: " + i);
        }
    }
}
