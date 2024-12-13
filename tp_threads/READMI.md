# INTRODUCTION :

   This lab aims to introduce multithreading in Java by creating and executing threads for concurrent tasks. It covers fundamental concepts like the Runnable interface, the run method, and thread pools for parallel computations. The exercise explores the benefits of parallelism and efficient resource management.


## Exercice 1: Multithreading Example

### Description  
This project demonstrates the basics of multithreading in Java by creating a class that implements the `Runnable` interface and executes tasks concurrently. It highlights the non-deterministic behavior of threads running in parallel.

### Key Features  
- Creation of a `Talkative` class that implements `Runnable`.  
- Launching multiple threads to execute tasks concurrently.  
- Observation of unordered and interleaved outputs due to concurrent execution.

### How It Works  
1. **Talkative Class**: Implements the `Runnable` interface and displays a unique integer 100 times to the console.

```java
public class Talkative implements Runnable{
    private final int count;

    public Talkative(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Thread ID :"+count+ ", iteration: " + i);
        }
    }
}

```

2. **Main Class**: Creates and starts 3 threads, each running an instance of `Talkative` with a unique identifier.

```java
public class ThreadsExemple {
    public static void main(String[] args) {

        for (int i=1 ; i<=100 ; i++){
            Talkative talkative = new Talkative(i);
            Thread thread = new Thread(talkative);
            thread.start();
        }
    }
}
```

### Observations  

When the program is executed, the threads run in parallel, producing a mixed and unordered output on the console. This demonstrates the non-deterministic nature of multithreaded execution.

Here is a screenshot of the console output during the execution of the program:

![image](https://github.com/user-attachments/assets/ba81ada1-8369-4d8e-aaf7-bf2ce49a1340)


## Exercice 2: Parallel Sum Calculation of an Array Using Threads


### Description  
This project demonstrates how to use multithreading in Java to calculate the sum of an array of integers in parallel by dividing the task across multiple threads.

### Key Features  
- Creation of a `Sommeur` class that implements the `Runnable` interface.  
- Each thread calculates the sum of a specific range of the array.  
- Use of the `join` method to wait for threads to finish before displaying the total result.

### How It Works  
1. **Sommeur Class**: Implements the `Runnable` interface and calculates the sum of a specific range of an integer array.

   ```java
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
   ``
   
2. **Main Class (ThreadSomme)**: Creates two threads to calculate the sum of two different ranges of the array.

```java
public class ThreadSomme {
    public static void main(String[] args) {
        // Tableau de nombres
        int[] nombres = {5, 8, 33, 9, 80, 2, 73, 4, 56, 20, 34, 45, 58, 90};

        // Création des threads pour calculer des plages spécifiques
        Sommeur sommeur1 = new Sommeur(nombres, 0, 6); // Plage 0 à 6
        Sommeur sommeur2 = new Sommeur(nombres, 7, 13); // Plage 7 à 13

        Thread thread1 = new Thread(sommeur1);
        Thread thread2 = new Thread(sommeur2);

        // Démarrage des threads
        thread1.start();
        thread2.start();

        // Attente de la fin des threads
        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            e.getMessage();
        }

        // Calcul de la somme totale
        int sommeTotale = sommeur1.getSomme() + sommeur2.getSomme();

        // Affichage du résultat
        System.out.println("Somme totale : " + sommeTotale);
    }
}
```
### Observations  
The two threads execute in parallel to calculate the sums of their respective ranges. Once the threads are finished, the results are combined to get the total sum.  

Here is a screenshot of the console output during the execution of the program:  
![image](https://github.com/user-attachments/assets/36c3a7d0-3372-4aea-bb59-1d9d0c42028d)

