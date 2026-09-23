/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão1;

/**
 *
 * @author Aluno
 */
public class Questão1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t1 = new Thread(new RacerRunnable(1));
        t1.start();

        // Forma 2 (extends Thread)
        RacerThread t2 = new RacerThread(2);
        t2.start();
    }
}

 // Forma 1: Runnable
class RacerRunnable implements Runnable {
    int i;
    public RacerRunnable(int i) { this.i = i; }
    
    @Override
    public void run() {
        while (true) { System.out.println("Racer " + i + " – imprimindo"); }
    }
}

// Forma 2: extends Thread
class RacerThread extends Thread {
    int i;
    public RacerThread(int i) { this.i = i; }
    
    @Override
    public void run() {
        while (true) { System.out.println("Racer " + i + " – imprimindo"); }
    }
}