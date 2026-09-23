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
        Racer r = new Racer(1);
        r.start();
    }
}

 class Racer extends Thread{
        int i;
        
        public Racer (int i){
            this.i = i;
        }
        
        public void run(){
             while(true){
                  System.out.println("Racer " + i + " imprimindo");
        }
    }
        
    }
