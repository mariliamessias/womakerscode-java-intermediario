package com.br.loiane.java.intermediario.activities.threads;

public class TiqueTaque {
    boolean tique;

    synchronized void tique(boolean estaExecutando) throws InterruptedException {
        if(!estaExecutando){
            tique = true;
            notify();
            return;
        }

        System.out.print("Tique ");
        tique = true;
        notify();

        while (tique){
            wait();
        }
    }

    synchronized void taque(boolean estaExecutando) throws InterruptedException {
        if(!estaExecutando){
            tique = false;
            notify();
            return;
        }

        System.out.println("Taque");
        tique = false;
        notify();

        while (!tique){
            wait();
        }
    }
}
